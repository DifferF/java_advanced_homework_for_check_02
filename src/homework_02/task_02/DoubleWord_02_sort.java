package homework_02.task_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/*
Задание 2
Используя коллекцию удвойте слово:
1. Введите с клавиатуры 5 слов в список строк.
2. Метод doubleValues должен удваивать слова по принципу a,b,c -> a,a,b,b,c,c.
3. Используя цикл for выведите результат на экран, каждое значение с новой строки.
 */

public class DoubleWord_02_sort {

    public static void main(String[] args) throws IOException {

        // Создаем объект arrayList
        ArrayList<String> list = new ArrayList<>();
        // Создаем объект BufferedReader, для дальнейшего ввода с клавиатуры
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Циклом заполняем массив arrayList значениями
        for (int i = 0; i < 5; i++) {
            int counter = i + 1;
            System.out.print("Введите значение - " + counter + " |");
            String s = reader.readLine();
            // Добавляем значение в конец массива
            list.add(s);
        }
        System.out.println("Размер Листа " + list.size());
        doubleValues(list);
        System.out.println("Стал Размер Листа " + list.size());

        // Выводим на экран все содержимое
        for (String temp : list) {
            System.out.println(temp);
        }
    }

    public static ArrayList doubleValues(ArrayList<String> listInput) {

        int size = listInput.size();

        for (int i = 0; i < size; i++) {
            String set = listInput.get(i);
            listInput.add(set);
        }
        Collections.sort(listInput);
        return listInput;
    }
}
