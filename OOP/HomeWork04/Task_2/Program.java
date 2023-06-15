package Task_2;

/*
Напишите обобщенный метод printArray, который принимает массив любого типа и выводит его элементы на консоль.
В этом примере мы объявляем обобщенный метод printArray, который принимает массив типа T. Затем мы используем цикл for-each, чтобы пройти по всем элементам массива и вывести их на консоль.
В методе main мы создаем массивы типов Integer и String и вызываем printArray для каждого из них. В результате мы получаем вывод на консоль элементов каждого массива.
Таким образом, обобщенные методы позволяют нам создавать код, который может работать с разными типами данных, обеспечивая повторное использование и гибкость.
 */
public class Program {
    public static void main(String[] args) {
        printArray(new String[] { "el1", "el2", "el3" });
        printArray(new Integer[] { 8, 4, 15, 0 });
    }

    public static <T> void printArray(T[] array) {
        System.out.println("Массив типа - " + array.getClass().getName());
        for (T el : array) {
            System.out.print(el + " ");
        }
        System.out.println();
    }
}
