package factory.config_factory;

public class Test {

    public static void main(String[] args) {
        Coffee coffee = CoffeeFactory.createCoffee("latte");

        System.out.println(coffee.getName());
    }
}
