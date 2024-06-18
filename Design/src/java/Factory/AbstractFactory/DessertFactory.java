package Factory.AbstractFactory;

//抽象出工厂可以生产的同一一系列的产品
public interface DessertFactory {
    Coffee createCoffee();

    Dessert createDessert();
}
