package OOP.HomeWork06.Model;

public class Model implements OperationMath, SetValue {
    private double number;
    // Принцип разделения интерфейса
    @Override
    public void setNumber(double number) {
        this.number = number;
    }

    @Override
    public double div(double number) {
        return this.number / number;
    }

    @Override
    public double multi(double number) {
        return this.number * number;
    }

    @Override
    public double sum(double number) {
        return this.number + number;
    }

    @Override
    public double sub(double number) {
        return this.number - number;
    }

}
