package factory.factory_method;

public class AmericanCoffeeFactory implements CoffeeFactory{

    //返回美式咖啡
    @Override
    public Coffee creatCoffee() {
        return new AmericanCoffee();
    }
}
