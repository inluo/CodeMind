package factory.abstract_factory;

//甜品类
public abstract class Dessert {
    public abstract String getName();

    //奶油
    public void addsugar() {
        System.out.println("奶油");
    }


}
