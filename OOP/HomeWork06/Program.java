package OOP.HomeWork06;

import OOP.HomeWork06.Model.Model;
import OOP.HomeWork06.Presenter.Presenter;
import OOP.HomeWork06.View.View;

public class Program {
    public static void main(String[] args) {
        Presenter p = new Presenter(new Model(), new View());
        p.buttonClick();
    }

}
