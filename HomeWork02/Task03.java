package HomeWork02;

import java.util.Scanner;
import java.util.logging.*;
import java.io.IOException;

public class Task03 {
    public static void main(String[] args) throws IOException {
        // Считывание данных с консоли
        Scanner inConsol = new Scanner(System.in);
        System.out.println("\nВведите первое число: ");
        int number1 = inConsol.nextInt();
        System.out.println("Введите второе число: ");
        int number2 = inConsol.nextInt();
        System.out.println("Выберите операцию (+,-,*,/): ");
        String operation = inConsol.next();
        // Логер
        Logger logger = Logger.getLogger(Task03.class.getName());
        FileHandler fh = new FileHandler("HomeWork02/logCalcul.txt", true);
        fh.setEncoding("UTF-8");
        logger.addHandler(fh);
        SimpleFormatter txt = new SimpleFormatter();
        fh.setFormatter(txt);
        // Калькулятор
        switch (operation) {
            case "+":
                System.out.printf("Результат: %d", number1 + number2);
                logger.info(String.format("%d + %d = %d", number1, number2, number1 + number2));
                break;
            case "-":
                System.out.printf("Результат: %d", number1 - number2);
                logger.info(String.format("%d - %d = %d", number1, number2, number1 - number2));
                break;
            case "/":
                if (number2 == 0) {
                    System.out.println("Вы делите на ноль!");
                    logger.info("Вы делите на ноль!");
                    break;
                }
                System.out.printf("Результат: %d", number1 / number2);
                logger.info(String.format("%d / %d = %d", number1, number2, number1 / number2));
                break;
            case "*":
                System.out.printf("Результат: %d", number1 * number2);
                logger.info(String.format("%d * %d = %d", number1, number2, number1 * number2));
                break;
            default:
                System.out.println("Повторите попытку! Список операторов: +, -, *, /");
                logger.info("Повторите попытку! Список операторов: +, -, *, /");
        }
        inConsol.close();
    }
}
