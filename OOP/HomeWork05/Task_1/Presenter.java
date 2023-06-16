package Task_1;

public class Presenter {
    protected Model model;
    protected View view;

    public Presenter(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void buttonClick() {
        boolean flag = true;
        while (flag) {
            flag = operation();
        }
    }

    private boolean operation() {
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
                number2 = validDiv(view.getValue("Второе число"));
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

    private double validDiv(double number) {
        boolean flag = true;
        while (flag) {
            if (number == 0) {
                System.out.println("Вы делите на ноль!");
                number = view.getValue("Второе число");
            } else flag = false;
        }
        return number;
    }
}
