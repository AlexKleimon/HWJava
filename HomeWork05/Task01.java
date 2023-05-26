package HomeWork05;

import java.util.Arrays;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
1. Реализуйте структуру телефонной книги с помощью HashMap, учитывая что 1 человек может иметь несколько
телефонов. Добавить функции 1) добавления номера. 2) Вывод всего.
Пример:
Я ввожу: 1
К: введите фамилию
Я: Иванов
К: Введите номер
Я: 1242353
К: Введите 1) Добавление номера 2) Вывод всего
Я: 1
К: Введите фамилию
Я: Иванов
К: Введите номер
Я: 547568
К: Введите 1) Добавление номера 2) Вывод всего
Я: 2
К: Иванов: 1242353, 547568
*/
public class Task01 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        HashMap<String, String> telBook = new HashMap<>();
        boolean flag = true;
        while (flag) {
            try {
                if (!telBook.isEmpty()) {
                    System.out.println("Введите 1) Добавление номера или 2) Вывод данных 3) Выход из программы.");
                    int temp = sc.nextInt();
                    sc.nextLine();
                    switch (temp) {
                        case 1 -> inputData(telBook);
                        case 2 -> printData(telBook);
                        case 3 -> flag = false;
                        default -> System.out.println("Повторите попытку.");
                    }
                } else {
                    inputData(telBook);
                }
            } catch (InputMismatchException e) {
                System.out.println("Неверный формат входных данных. Перезапустите программу.");
                break;
            }
        }
        sc.close();
    }

    private static void inputData(HashMap<String, String> telBook) {
        System.out.println("Введите фамилию:");
        String name = sc.nextLine();
        if (telBook.containsKey(name)) {
            System.out.println("Введите номер телефона:");
            String temp = telBook.get(name);
            String numberTel = sc.nextLine();
            numberTel += ", " + temp;
            telBook.put(name, numberTel);
        } else {
            System.out.println("Введите номер телефона:");
            String numberTel = sc.nextLine();
            telBook.put(name, numberTel);
        }
    }

    private static void printData(HashMap<String, String> telBook) {
        String[] name = telBook.keySet().toArray(new String[0]);
        Arrays.sort(name);
        for (String s : name) {
            System.out.printf("Фамилия: %s, номер(-а) телефона(-ов): %s.\n", s, telBook.get(s));
        }
    }
}
