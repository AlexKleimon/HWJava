package Task_1;

public class Program {
    public static void main(String[] args) {
        Presenter p = new Presenter(new Model(), new View());
        p.buttonClick();
    }

}
