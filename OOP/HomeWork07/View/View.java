package OOP.HomeWork07.View;

import java.util.Scanner;

public class View {
    protected Scanner sc = new Scanner(System.in);
    protected ReValue ReValue = new ReValue(sc);
    protected ImValue ImValue = new ImValue(sc);

    public double getValueRe(String title) {
        return ReValue.getValue(title);
    }

    public double getValueIm(String title) {
        return ImValue.getValue(title);
    }

    public String getOperand(String title) {
        System.out.printf("%s: ", title);
        return sc.nextLine();
    }

    public void print(String result, String title) {
        System.out.printf("%s = %s\n", title, result);
    }
}
