package HomeWork01;

public class Task02 {
    // Вывести все простые числа от 1 до 1000
    public static void primeNumbers() {
        System.out.println("Простые числа: ");
        for (int i = 2; i <= 1000; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                System.out.printf("%d ", i);
        }
    }
}
