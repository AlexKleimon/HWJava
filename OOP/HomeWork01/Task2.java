package OOP.HomeWork01;

/*
Задача 2:
Реализуйте класс "Прямоугольник" (Rectangle), который имеет свойства ширина (width), и высота (height).
Класс должен обладать следующими методами:
Конструктор без параметров, который создает прямоугольник с шириной и высотой по умолчанию.
Конструктор, который принимает значения ширины и высоты и создает прямоугольник с заданными значениями.
Методы доступа (геттеры и сеттеры) для свойств ширины и высоты.
Метод "вычислить площадь" (calculateArea), который возвращает площадь прямоугольника (ширина*высота).
Метод "вычислить периметр" (calculatePerimeter) который возвращает периметр прямоугольника (2*(ширина+высота)).
 */
public class Task2 {
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle();
        Rectangle rec2 = new Rectangle(10);
        Rectangle rec3 = new Rectangle(5, 2);
        System.out.println("Rec 1:\nВысота: " + rec1.getHeight() + " Ширина: " + rec1.getWidth());
        System.out.println("Площадь: " + rec1.calculateArea());
        System.out.println("Периметр: " + rec1.calculatePerimeter());
        System.out.println("Rec 2:\nВысота: " + rec2.getHeight() + " Ширина: " + rec2.getWidth());
        System.out.println("Площадь rec2: " + rec2.calculateArea());
        System.out.println("Периметр rec2: " + rec2.calculatePerimeter());
        System.out.println("Rec 3:\nВысота: " + rec3.getHeight() + " Ширина: " + rec3.getWidth());
        System.out.println("Площадь rec3: " + rec3.calculateArea());
        System.out.println("Периметр rec3: " + rec3.calculatePerimeter());
    }

}
