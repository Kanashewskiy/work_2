package EXP_1;

public interface QueueBehaviour {
    void takeInQueue(Actor actor);
    void takeOrders();
    void giveOrder();
    void releaseFromQueue();
}
