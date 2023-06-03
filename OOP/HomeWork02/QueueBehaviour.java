package OOP.HomeWork02;

import java.util.LinkedList;

public interface QueueBehaviour {
    LinkedList<String> QUEUE = new LinkedList<>();

    default void takeOrder() {
        System.out.println(QUEUE.getFirst() + " забрал(а) заказ.");
    }

    default void giveOrder() {
        System.out.println(QUEUE.getFirst() + " сделал(а) заказ.");
    }

    default void releaseFromQueue() {
        System.out.println(QUEUE.getFirst() + " покинул(а) очередь.");
    }

}
