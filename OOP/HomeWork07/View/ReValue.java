package OOP.HomeWork07.View;

import java.util.Scanner;

public class ReValue implements GetValueCompl{
    Scanner sc;

    public ReValue(Scanner sc) {
        this.sc = sc;
    }

    @Override
    public double getValue(String title) {
        System.out.printf("Введите действительную часть %s числа: ", title);
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
}
