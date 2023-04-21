package HomeWork01;

public class Task04 {
    // Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть
    // заменены знаком вопроса, например, 2? + ?5 = 69. Требуется восстановить
    // выражение до верного равенства. Предложить хотя бы одно решение или сообщить,
    // что его нет. Под знаками вопросов - одна и та же цифра Ввод: 2? + ?5 = 69
    // Вывод: 24 + 45 = 69
    public static void equation() {
        System.out.println(
                "\nВведите уравнение типа q + w = e (q,w,e >=0).\nПример: 2?,?5,69, где ? - неизвестная цифра:");
        program.inConsol.nextLine();
        String equat = program.inConsol.nextLine();
        String[] arry = equat.split(",");
        int count = 0;
        for (int i = 0; i < 10; i++) {
            String number1 = arry[0].replace("?", "" + i);
            String number2 = arry[1].replace("?", "" + i);
            String result = arry[2];
            if (checkEquation(number1, number2, result)) {
                count++;
                System.out.printf("%s + %s = %s\n", number1, number2, result);
            }
        }
        if (count == 0)
            System.out.println("Решения нет.");
    }

    static boolean checkEquation(String number1, String number2, String result) {
        int num1 = Integer.parseInt(number1);
        int num2 = Integer.parseInt(number2);
        int res = Integer.parseInt(result);
        if (num1 + num2 == res)
            return true;
        else
            return false;
    }
}
