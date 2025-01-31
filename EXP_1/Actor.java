package EXP_1;

public abstract class Actor implements ActorBehavoir {

    protected boolean isTakeOrder;
    protected boolean isMakeOrder;
    protected final String name;

    public Actor(String name) {
        this.name = name;
    }

    public abstract String getName();

}
