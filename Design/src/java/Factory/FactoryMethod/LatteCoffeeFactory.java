package Factory.FactoryMethod;

//拿铁具体工厂
public class LatteCoffeeFactory implements CoffeeFactory{

    //返回拿铁咖啡
    @Override
    public Coffee creatCoffee() {
        return new LatteCoffee();
    }
}
