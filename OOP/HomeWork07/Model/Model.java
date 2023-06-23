package OOP.HomeWork07.Model;

public class Model implements SetValue {
    private double ReNumber, ImNumber;

    @Override
    public void setNumberRe(double ReNumber) {
        this.ReNumber = ReNumber;
    }

    @Override
    public void setNumberIm(double ImNumber) {
        this.ImNumber = ImNumber;
    }

    public String multiComp(double ReNumber, double ImNumber) {
        double number1 = this.ReNumber * ReNumber - this.ImNumber * ImNumber;
        double number2 = this.ReNumber * ImNumber + this.ImNumber * ReNumber;
        String result = "";

        if (number2 == 0) {
            result = String.format("%.2f", number1);
        } else if (number2 > 0) {
            result = String.format("%.2f + %.2f i", number1, number2);
        } else {
            result = String.format("%.2f %.2f i", number1, number2);
        }
        return result;
    }

    public String divComp(double ReNumber, double ImNumber) {
        double number1 = (this.ReNumber * ReNumber + this.ImNumber * ImNumber)
                / (Math.pow(ReNumber, 2) + Math.pow(ImNumber, 2));

        double number2 = (this.ImNumber * ReNumber - this.ReNumber * ImNumber)
                / (Math.pow(ReNumber, 2) + Math.pow(ImNumber, 2));
        String result = "";
        if (number2 == 0) {
            result = String.format("%.2f", number1);
        } else if (number2 > 0) {
            result = String.format("%.2f + %.2f i", number1, number2);
        } else {
            result = String.format("%.2f %.2f i", number1, number2);
        }
        return result;
    }

    public String sumComp(double ReNumber, double ImNumber) {
        double number1 = this.ReNumber + ReNumber;
        double number2 = this.ImNumber + ImNumber;
        String result = "";
        if (number2 == 0) {
            result = String.format("%.2f", number1);
        } else if (number2 > 0) {
            result = String.format("%.2f + %.2f i", number1, number2);
        } else {
            result = String.format("%.2f %.2f i", number1, number2);
        }
        return result;
    }

}
