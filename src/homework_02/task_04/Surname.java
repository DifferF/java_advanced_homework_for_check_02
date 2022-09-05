package homework_02.task_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Objects;

/*
Задание 4+
Программа определяет, какая семья (фамилия) живёт в городе:
Пример ввода:
·Бангкок
·Ивановы
·Киев
·Петровы
·Лондон
·Абрамовичи
·Лондон
Пример вывода:
·Абрамовичи
 */

public class Surname {

    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        HashMap<String, String> addressSurname = new HashMap<>();

        int counter = 1;

        for (int i = 0; i < counter; i++) {
            System.out.println("Для выхода введите - | end |");
            System.out.println("У нас в коллекции | " + addressSurname.size() + " | городов и фамилий");

            System.out.print("Город - " + counter + " |");
            String key = reader.readLine();

            if (Objects.equals(key, "end")) {
                keyTown(addressSurname);
                break;
            }

            System.out.print("Фамилия - " + counter + " |");
            String values = reader.readLine();

            if (Objects.equals(values, "end")) {
                keyTown(addressSurname);
                break;
            } else {
                addressSurname.put(key, values);
                counter++;
            }
        }
    }

    public static void keyTown(HashMap addressSurname) throws IOException {
        System.out.println("Выберите город");
        System.out.println(addressSurname.keySet());
        System.out.print("Город |");
        String key = reader.readLine();
        System.out.println("В городе " + key + " проживает семейка " + addressSurname.get(key));
    }
}



