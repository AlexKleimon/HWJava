package Task_1;

import java.util.Scanner;

public class View {
    protected Scanner sc = new Scanner(System.in);

    public double getValue(String title) {
        System.out.printf("%s: ", title);
        double value;
        if (sc.hasNextDouble()) {
            value = sc.nextDouble();
            sc.nextLine();
        } else {
            System.out.println("Ошибка!Ведите число!");
            sc.nextLine();
            value = getValue(title);
        }
        return value;
    }

    public String getOperand(String title) {
        System.out.printf("%s: ", title);
        return sc.nextLine();
    }

    public void print(double result, String title) {
        System.out.printf("%s = %.2f\n", title, result);
    }
}
