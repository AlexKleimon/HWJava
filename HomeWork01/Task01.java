package HomeWork01;

public class Task01 {
    /*
     * Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение
     * чисел от 1 до n)
     */
    // Метод подсчета n-ого треугольного числа
    public static void triangularNumber(int number) {
        int result = (number / 2) * (number + 1);
        System.out.println(result);
    }

    // Метод подсчета n!
    public static void factorial(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        System.out.println(result);
    }
}
