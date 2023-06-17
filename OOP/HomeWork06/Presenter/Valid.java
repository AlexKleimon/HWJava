package OOP.HomeWork06.Presenter;

import OOP.HomeWork06.View.View;

public class Valid {
    protected View view;

    public Valid() {
        this.view = new View();
    }

    public double validDiv(double number) {
        boolean flag = true;
        while (flag) {
            if (number == 0) {
                System.out.println("Вы делите на ноль!");
                number = view.getValue("Второе число");
            } else
                flag = false;
        }
        return number;
    }
}
