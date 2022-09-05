package homework_02.task_05;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Objects;

/*
Задание 5+
Вводить с клавиатуры строки, пока пользователь не введёт строку 'end':
1.Создать список строк.
2.Ввести строки с клавиатуры и добавить их в список.
3.Вводить с клавиатуры строки, пока пользователь не введёт строку "end".  "end" не учитывать.
4.Вывести строки на экран, каждую с новой строки.
 */
public class StringEnd {

    public static void main(String[] args) throws IOException {
        ArrayList<String> StringList = new ArrayList<>();
        System.out.println("Размер Листа " + StringList.size());
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int counter = 1;
        for (int i = 0; i < counter; i++) {
            System.out.print("Введите значение - " + counter + " |");
            String s = reader.readLine();
            if (Objects.equals(s, "end")) {
                for (String temp : StringList) {
                    System.out.println(temp);
                }
                System.out.println("Размер Листа " + StringList.size());
                //  StringListPrint(StringList);
                break;
            } else {
                StringList.add(s);
                counter++;
            }
        }
    }

    // как вариант, не используется в данном течение
    public static void StringListPrint(ArrayList<String> listInput) {
        for (String temp : listInput) {
            System.out.println(temp);
        }
    }
}
