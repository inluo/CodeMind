package Factory.AbstractFactory;

/**
 * 意大利式工厂
 * key 此时不再是一个具体的产品工厂，而是一个系列的产品工厂
 */
public class ItalyDessertFactory implements DessertFactory{
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new Tiramisu();
    }
}
