package OOP.HomeWork02;

/*
 Реализовать класс Market и все его обязательные методы. Этот класс должен реализовывать методы из интерфейса QueueBehaviour,
 которые имитируют работу очереди. Кроме того, класс должен содержать методы, соответствующие интерфейсу MarketBehaviour,
 которые добавляют и удаляют людей из очереди, а также метод update, который обновляет состояние магазина путем принятия
 и отдачи заказов.
 */
public class Main {
    public static void main(String[] args) {
        Market shop = new Market();
        shop.addQueue("Виктор");
        shop.addQueue("Михаил");
        shop.addQueue("Лидия");
        shop.addQueue("Вадим");
        shop.update();
        shop.addQueue("Игорь");
        shop.update();
        shop.addQueue("Ирина");
        shop.update();
        shop.update();
        shop.update();
        shop.update();
        shop.update();
    }
}
