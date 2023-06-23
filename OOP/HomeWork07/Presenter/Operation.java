package OOP.HomeWork07.Presenter;

import java.util.logging.ConsoleHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import OOP.HomeWork07.Model.Model;
import OOP.HomeWork07.View.View;

public class Operation implements I_Operation {
    protected View view;
    protected Model model;
    protected Valid valid;
    protected static final Logger logger = Logger.getLogger(Operation.class.getName());

    public Operation() {
        this.model = new Model();
        this.valid = new Valid();
        this.view = new View();
    }

    @Override
    public boolean operation() {
        boolean flag = true;
        ConsoleHandler ch = new ConsoleHandler();
        ch.setFormatter(new SimpleFormatter());
        logger.addHandler(ch);
        double ReNumber1 = view.getValueRe("первого");
        double ImNumber1 = view.getValueIm("первого");
        double ReNumber2, ImNumber2;
        switch (view.getOperand("Операция")) {
            case "+" -> {
                ReNumber2 = view.getValueRe("второго");
                ImNumber2 = view.getValueIm("второго");
                model.setNumberRe(ReNumber1);
                model.setNumberIm(ImNumber1);
                view.print(model.sumComp(ReNumber2, ImNumber2), "Результат сложения");
                logger.info((String.format("Результат сложения: %s ", model.sumComp(ReNumber2, ImNumber2))));
            }
            case "*" -> {
                ReNumber2 = view.getValueRe("второго");
                ImNumber2 = view.getValueIm("второго");
                model.setNumberRe(ReNumber1);
                model.setNumberIm(ImNumber1);
                view.print(model.multiComp(ReNumber2, ImNumber2), "Результат умножения");
                logger.info((String.format("Результат умножения: %s", model.multiComp(ReNumber2, ImNumber2))));
            }
            case "/" -> {
                ReNumber2 = valid.validDivRe(view.getValueRe("второго"));
                ImNumber2 = valid.validDivIm(view.getValueIm("второго"));
                model.setNumberRe(ReNumber1);
                model.setNumberIm(ImNumber1);
                view.print(model.divComp(ReNumber2, ImNumber2), "Результат деления");
                logger.info((String.format("Результат деления: %s", model.divComp(ReNumber2, ImNumber2))));
            }
            default -> System.out.println("Операция не выполнима. Повторите попытку.");
        }
        if (view.getOperand("Напишите 'end' чтобы выйти или нажмите 'Enter' чтобы продолжить").equals("end")) {
            flag = false;
        }
        return flag;
    }
}
