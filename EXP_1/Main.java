package EXP_1;
/**
Реализовать класс Market и все методы, которые он обязан реализовывать.
Методы из интерфейса QueueBehaviour, имитируют работу очереди,
MarketBehaviour – помещает и удаляет человека из очереди,
метод update – обновляет состояние магазина (принимает и отдает заказы).
*/

public class Main {
    public static void main(String[] args) {
        Human h1 = new Human("Олег");
        Human h2 = new Human("Дима");

        Market market = new Market();

        market.acceptToMarket(h1);
        market.acceptToMarket(h2);
        market.takeInQueue(h1);
        market.takeInQueue(h2);
        market.giveOrder();
        market.takeOrders();
        market.releaseFromQueue();
        market.releaseFromQueue();
        market.releaseFromMarket(h1);
        market.releaseFromMarket(h2);
        market.update();
    }

}
