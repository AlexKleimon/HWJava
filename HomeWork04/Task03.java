package HomeWork04;

import java.util.LinkedList;
import java.util.Scanner;

/*
 *  В калькулятор добавьте возможность отменить последнюю операцию.
Пример

1
+
2
ответ:
3

+
4
ответ:
7
+
2

ответ:

9
1
Ответ 8
Отмена -> 9
Отмена -> 7
Отмена -> 3
+
2
Ответ 5
 */
public class Task03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> result = new LinkedList<>();
        boolean flag = true;
        System.out.println("Введите первое число: ");
        int number1 = sc.nextInt();
        System.out.println("Выберите операцию (+,-,*,/): ");
        sc.nextLine();
        String operation = sc.nextLine();
        System.out.println("Введите второе число: ");
        int number2 = sc.nextInt();
        sc.nextLine();
        result.add(calculator(number1, operation, number2));

        while (flag) {
            System.out.println("Результат операции: " + result.getLast());
            System.out.println("История результатов: " + result.toString());
            System.out.println(
                    "Выберите операцию (+,-,*,/), либо завершите работу написав \"end\" или \"cancel\" для отмены последней операции:");
            operation = sc.nextLine();
            if (operation.equals("end")) {
                flag = false;
                System.out.println("Конец работы.");
            } else if (operation.equals("cancel")) {
                result.removeLast();
                System.out.println("Отмена последней операции...");
                if (result.isEmpty()) {
                    flag = false;
                    System.out.println("Запустите программу заново.");
                }
            } else {
                System.out.println("Введите число для подсчета: ");
                number2 = sc.nextInt();
                result.add(calculator(result.getLast(), operation, number2));
                sc.nextLine();
            }
        }
        sc.close();
    }

    private static int calculator(int number1, String operation, int number2) {
        switch (operation) {
            case "+":
                number1 += number2;
                break;
            case "-":
                number1 -= number2;
                break;
            case "/":
                if (number2 == 0) {
                    System.out.println("Вы делите на ноль!");
                    break;
                }
                number1 /= number2;
                break;
            case "*":
                number1 *= number2;
                break;
            default:
                System.out.println("Повторите попытку! Список операторов: +, -, *, /");
        }
        return number1;
    }
}
