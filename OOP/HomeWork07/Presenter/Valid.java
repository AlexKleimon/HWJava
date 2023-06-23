package OOP.HomeWork07.Presenter;

import OOP.HomeWork07.View.View;

public class Valid {
    protected View view;

    public Valid() {
        this.view = new View();
    }

    public double validDivRe(double ReNumber) {
        boolean flag = true;
        while (flag) {
            if (ReNumber == 0) {
                System.out.println("Вы делите на ноль!");
                ReNumber = view.getValueRe("второго");
            } else
                flag = false;
        }
        return ReNumber;
    }
    public double validDivIm(double ImNumber) {
        boolean flag = true;
        while (flag) {
            if (ImNumber == 0) {
                System.out.println("Вы делите на ноль!");
                ImNumber = view.getValueIm("второго");
            } else
                flag = false;
        }
        return ImNumber;
    }
}
