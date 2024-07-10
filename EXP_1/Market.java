package EXP_1;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Market implements MarketBehaviour, QueueBehaviour {

    private List<Human> actors = new LinkedList<>();
    private Queue<Human> actorQueue = new ArrayDeque<>();

    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println(actor.getName() + " зашёл в магазин");
        actors.add((Human) actor);
    }

    @Override
    public void releaseFromMarket(Actor actor) {
        actors.remove(actor);
        System.out.println(actor.getName() + " вышел из магазина");
    }

    @Override
    public void update() {

    }

    @Override
    public void takeInQueue(Actor actor) {
        actorQueue.add((Human) actor);
        System.out.println(actor.getName() + " встал в очередь");
    }

    @Override
    public void takeOrders() {
        actorQueue.peek().isTakeOrder();
        System.out.println(actorQueue.peek().getName() + " забрал заказ");
    }

    @Override
    public void giveOrder() {
        actorQueue.peek().isMakeOrder();
        System.out.println(actorQueue.peek().getName() + " сделал заказ");
    }

    @Override
    public void releaseFromQueue() {
        System.out.println(actorQueue.peek().getName() + " вышел из очереди");
        actorQueue.poll();
    }
}
