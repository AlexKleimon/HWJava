package HomeWork01;

import java.util.Scanner;

public class program {
    public static Scanner inConsol = new Scanner(System.in);

    public static void main(String[] args) {
        /*
         * Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение
         * чисел от 1 до n)
         */
        Task01.triangularNumber(4);
        Task01.factorial(5);
        // Вывести все простые числа от 1 до 1000
        Task02.primeNumbers();
        // Реализовать простой калькулятор
        Task03.Calculator();
        /*
         * Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть
         * заменены знаком вопроса, например, 2? + ?5 = 69. Требуется восстановить
         * выражение до верного равенства. Предложить хотя бы одно решение или сообщить,
         * что его нет. Под знаками вопросов - одна и та же цифра Ввод: 2? + ?5 = 69
         * Вывод: 24 + 45 = 69
         */
        Task04.equation();
        inConsol.close();
    }
}