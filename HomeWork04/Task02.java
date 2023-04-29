package HomeWork04;

import java.util.LinkedList;

/*
 *Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди,
dequeue() - возвращает первый элемент из очереди и удаляет его,
first() - возвращает первый элемент из очереди, не удаляя.

Пример:
[1, 2, 3, 4, 5, 6, 7]
spisok.enqueue(8)
[1, 2, 3, 4, 5, 6, 7,8]
spisok.dequeue
1
[2, 3, 4, 5, 6, 7,8]
spisok.first()
2
[2, 3, 4, 5, 6, 7,8]
 */
public class Task02 {
    public static void main(String[] args) {
        LinkedList<Integer> numberList = new LinkedList<>();
        for (int i = 1; i < 7; i++) {
            enqueue(numberList, i);
        }
        System.out.println("Исходный массив: " + numberList.toString());
        enqueue(numberList, 10);
        System.out.println("enqueue: " + numberList.toString());
        dequeue(numberList);
        first(numberList);
    }

    private static void enqueue(LinkedList<Integer> numberList, int number) {
        numberList.add(number);
    }

    private static void dequeue(LinkedList<Integer> numberList) {
        System.out.println("dequeue: " + numberList.removeFirst());
        System.out.println("dequeue: " + numberList.toString());
    }

    private static void first(LinkedList<Integer> numberList) {
        System.out.println("first: " + numberList.getFirst());
        System.out.println("first: " + numberList.toString());
    }
}
