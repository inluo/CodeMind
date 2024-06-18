package Factory.FactoryMethod;

//咖啡店
public class CoffeeStore {

    private CoffeeFactory coffeeFactory;

    //由调用方决定创建什么类型的工厂
    public void  setCoffeeStore(CoffeeFactory coffeeFactory){
        this.coffeeFactory = coffeeFactory;
    }

    //获得咖啡
    public Coffee orderCoffee(){
        Coffee coffee = coffeeFactory.creatCoffee();
        coffee.addMilk();
        coffee.addsugar();
        return coffee;
    }
}
