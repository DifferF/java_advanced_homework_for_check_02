package homework_02.task_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/*
Задание 3+
Минимальное из N чисел(использовать LinkedList):
1.Ввести с клавиатуры число N.
2.Считать N целых чисел и заполнить ими список - метод getIntegerList.
3.Найти минимальное число среди элементов списка - метод getMinimum.
 */

public class NumberN {

    public static void main(String[] args) throws Exception {
        LinkedList<Integer> integerNumber = getIntegerList();

        System.out.println(getMinimum_1(integerNumber));
        System.out.println(getMinimum_2(integerNumber));
        System.out.println(getMinimum_3(integerNumber));
    }

    public static Integer getMinimum_1(List<Integer> integerListMin) {
        System.out.print("getMinimum_1 - Collections.min(integerListMin) |");
        return Collections.min(integerListMin);
    }

    public static Integer getMinimum_2(List<Integer> integerListMin) {

        Integer Min = (Integer) integerListMin.get(0);
        for (int i = 0; i < integerListMin.size(); i++) {
            if (integerListMin.get(i) < Min) {
                Min = (Integer) integerListMin.get(i);
            }
        }
        System.out.print("getMinimum_2 - перебор мин значения |");
        return Min;
    }

    public static Integer getMinimum_3(List<Integer> integerListMin) {

        Collections.sort(integerListMin);
        integerListMin.get(0);
        System.out.print("getMinimum_3 -  Collections.sort(integerListMin) |");
        return integerListMin.get(0);
    }


    public static LinkedList<Integer> getIntegerList() throws IOException {
        LinkedList<Integer> list = new LinkedList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите количество N чисел - |");
        int nCounter = Integer.parseInt(reader.readLine());
        for (int i = 0; i < nCounter; i++) {
            System.out.print("Введите значение - " + (i + 1) + " |");
            list.add(Integer.parseInt(reader.readLine()));
        }
        return list;
    }
}
