package OOP.HomeWork03.task_1;

//1)В предыдущем ДЗ добавить реализацию собственного функционального интерфейса.
public class Main {
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle();
        System.out.println("Высота: " + rec1.getHeight() + " Ширина: " + rec1.getWidth());
        System.out.println("Площадь: " + rec1.calculateArea());
        System.out.println("Периметр: " + rec1.calculatePerimeter());
        I_size<Rectangle> sizeRec = (r, param1, param2) -> {
            r.setHeight(param1);
            r.setWidth(param2);
            return r;
        };
        rec1 = sizeRec.size(rec1, 5, 10);
        System.out.println("\nПосле изменений:\nВысота: " + rec1.getHeight() + " Ширина: " + rec1.getWidth());
        System.out.println("Площадь: " + rec1.calculateArea());
        System.out.println("Периметр: " + rec1.calculatePerimeter());
    }
}
