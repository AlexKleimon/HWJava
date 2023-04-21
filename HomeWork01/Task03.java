package HomeWork01;

public class Task03 {
    // Реализовать простой калькулятор
    public static void Calculator() {
        System.out.println("\nВведите первое число: ");
        int number1 = program.inConsol.nextInt();
        System.out.println("Введите второе число: ");
        int number2 = program.inConsol.nextInt();
        System.out.println("Выберите операцию (+,-,*,/): ");
        String operation = program.inConsol.next();
        switch (operation) {
            case "+":
                System.out.printf("Результат: %d", number1 + number2);
                break;
            case "-":
                System.out.printf("Результат: %d", number1 - number2);
                break;
            case "/":
                if (number2 == 0) {
                    System.out.println("Вы делите на ноль!");
                    break;
                }
                System.out.printf("Результат: %d", number1 / number2);
                break;
            case "*":
                System.out.printf("Результат: %d", number1 * number2);
                break;
        }
    }
}
