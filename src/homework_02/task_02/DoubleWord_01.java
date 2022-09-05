package homework_02.task_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Задание 2
Используя коллекцию удвойте слово:
1. Введите с клавиатуры 5 слов в список строк.
2. Метод doubleValues должен удваивать слова по принципу a,b,c -> a,a,b,b,c,c.
3. Используя цикл for выведите результат на экран, каждое значение с новой строки.
 */

public class DoubleWord_01 {

    public static void main(String[] args) throws IOException {

        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            int counter = i + 1;
            System.out.print("Введите значение - " + counter + " |");
            String s = reader.readLine();
            list.add(s);
        }
        System.out.println("Размер Листа " + list.size());
        list = doubleValues(list);
        // doubleValues(list);
        System.out.println("Стал Размер Листа " + list.size());

        for (String temp : list) {
            System.out.println(temp);
        }
    }

    public static ArrayList doubleValues(ArrayList<String> listInput) {

        ArrayList<String> doubleList = new ArrayList<>();
        int size = listInput.size();

        for (int i = 0; i < size; i++) {
            String set = listInput.get(i);
            doubleList.add(set);
            doubleList.add(set);
        }
        return doubleList;
    }

}
