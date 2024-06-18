package Factory.SimpleFactory;

public class Test {
    public static void main(String[] args) {
        //创建咖啡店类对象
        CoffeeStore store = new CoffeeStore();
        Coffee coffee = store.orderCoffee("american");

        System.out.println(coffee.getName());
    }
}
