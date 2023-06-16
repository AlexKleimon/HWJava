package Task_1;

public class Model {
    private double number;

    public void setNumber(double number) {
        this.number = number;
    }

    public double sum(double number) {
        return this.number += number;
    }

    public double multi(double number) {
        return this.number *= number;
    }

    public double div(double number) {
        return this.number /= number;
    }

    public double sub(double number) {
        return this.number -= number;
    }
}
