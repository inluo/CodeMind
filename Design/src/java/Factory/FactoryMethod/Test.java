package Factory.FactoryMethod;

public class Test {
    public static void main(String[] args) {

       CoffeeFactory coffeeFactory = new AmericanCoffeeFactory();

       CoffeeStore coffeeStore = new CoffeeStore();
       coffeeStore.setCoffeeStore(coffeeFactory);

       Coffee coffee = coffeeStore.orderCoffee();

       System.out.println(coffee.getName());
    }
}
