package factory.abstract_factory;

/**
 * 美式工厂
 *key 此时不再是一个具体的产品工厂，而是一个系列的产品工厂
 */
public class AmericanDessertFactory implements DessertFactory{

    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new MatchaMousse();
    }
}
