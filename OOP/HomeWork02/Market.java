package OOP.HomeWork02;

public class Market implements MarketBehaviour, QueueBehaviour {

    @Override
    public void addQueue(String name) {
        QUEUE.addLast(name);
        System.out.println(name + " встал(а) в очередь.");
        printQueue();
    }

    @Override
    public void removeQueue() {
        QUEUE.removeFirst();
    }

    public void printQueue() {
        System.out.println("Состояние очереди:");
        if (QUEUE.isEmpty()) {
            System.out.println("Очередь пуста.");
        } else {
            int count = 1;
            for (String nameCust : QUEUE) {
                System.out.println(count++ + ". " + nameCust);
            }
        }
    }

    public void update() {
        if (!QUEUE.isEmpty()) {
            giveOrder();
            takeOrder();
            releaseFromQueue();
            removeQueue();
            printQueue();
        } else
            System.out.println("Никого нет.Работа сделана.");
    }
}
