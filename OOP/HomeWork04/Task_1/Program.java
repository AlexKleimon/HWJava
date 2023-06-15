package Task_1;

/*
Напишите обобщенны метод printElement, который принимает один параметр типа Т и выводит его на консоль.
В этом примере мы объявляем обобщенный метод printElement, который принимает один параметр типа Т. Мы просто
выводим этот элемент на консоль с помощью sysout. В методе main мы вызываем printElement с различными типами
данных: целое число, строку и число с плавающей точкой. Компилятор автоматически выводит тип параметра Т на основе
переданных аргументов.
 */
public class Program {
    public static void main(String[] args) {
    printElement(5);
    printElement("Let's go");
    printElement(12.3321234);
    }
    public static  <T> void printElement(T param) {
        System.out.println(param + " - тип "+ param.getClass().getName());
    }
}
