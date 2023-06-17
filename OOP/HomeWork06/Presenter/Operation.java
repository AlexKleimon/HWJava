package OOP.HomeWork06.Presenter;

import OOP.HomeWork06.Model.Model;
import OOP.HomeWork06.View.View;

public class Operation implements I_Operation {
    protected View view;
    protected Model model;
    protected Valid valid;

    public Operation() {
        this.model = new Model();
        this.valid = new Valid();
        this.view = new View();
    }

    @Override
    public boolean operation() {
        boolean flag = true;
        double number1 = view.getValue("Первое число");
        double number2;
        switch (view.getOperand("Операция")) {
            case "+" -> {
                number2 = view.getValue("Второе число");
                model.setNumber(number1);
                view.print(model.sum(number2), "Результат сложения");
            }
            case "-" -> {
                number2 = view.getValue("Второе число");
                model.setNumber(number1);
                view.print(model.sub(number2), "Результат вычитания");
            }
            case "*" -> {
                number2 = view.getValue("Второе число");
                model.setNumber(number1);
                view.print(model.multi(number2), "Результат умножения");
            }
            case "/" -> {
                number2 = valid.validDiv(view.getValue("Второе число"));
                model.setNumber(number1);
                view.print(model.div(number2), "Результат деления");
            }
            default -> System.out.println("Операция не выполнима. Повторите попытку.");
        }
        if (view.getOperand("Напишите 'end' чтобы выйти или нажмите 'Enter' чтобы продолжить").equals("end")) {
            flag = false;
        }
        return flag;
    }
}
