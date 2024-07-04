package decorator;

//鸡蛋配料
public class Egg extends Garnish{

    public Egg(FastFood fastFood) {
        super(fastFood,1,"鸡蛋");
    }

    @Override
    public float cost() {
        return getPrice() + getFastFood().cost();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + getFastFood().getDesc();
    }
}
