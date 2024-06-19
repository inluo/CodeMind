package factory.abstract_factory;

public class Test {
    public static void main(String[] args) {
        //选择工厂创建
        //AmericanDessertFactory factory =new AmericanDessertFactory();
        ItalyDessertFactory factory = new ItalyDessertFactory();

        Coffee coffee = factory.createCoffee();
        Dessert dessert = factory.createDessert();
        System.out.println(coffee.getName());
        System.out.println(dessert.getName());
    }
}
