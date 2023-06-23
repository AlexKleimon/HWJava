package OOP.HomeWork07;


import OOP.HomeWork07.Model.Model;
import OOP.HomeWork07.Presenter.Presenter;
import OOP.HomeWork07.View.View;

public class Program {
    public static void main(String[] args){
        Presenter p = new Presenter(new Model(), new View());
        p.buttonClick();
    }

}
