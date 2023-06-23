package OOP.HomeWork07.Presenter;

import OOP.HomeWork07.View.View;


import OOP.HomeWork07.Model.Model;

public class Presenter {
    protected Model model;
    protected View view;
    protected Valid valid;
    protected Operation operation;

    public Presenter(Model model, View view) {
        this.model = model;
        this.view = view;
        this.valid = new Valid();
        this.operation = new Operation();
    }

    public void buttonClick() {
        boolean flag = true;
        while (flag) {
            flag = operation.operation();
        }
    }

}
