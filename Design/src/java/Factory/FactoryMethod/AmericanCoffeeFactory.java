package Factory.FactoryMethod;

public class AmericanCoffeeFactory implements CoffeeFactory{

    //返回美式咖啡
    @Override
    public Coffee creatCoffee() {
        return new AmericanCoffee();
    }
}
