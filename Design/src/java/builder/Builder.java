package builder;

/**
 * 抽象建造者类，简化系统结合指挥者类的功能
 */
public abstract class Builder {

    // 声明Bike类型的变量，并进行赋值
    protected Bike bike = new Bike();
    public abstract void buildFrame();
    public abstract void buildSeat();
    //构建自行车
    public abstract Bike createBike();

    //构建方法
    public Bike construct(){
        this.buildFrame();
        this.buildSeat();
        return this.createBike();
    }
}
//public abstract class Builder {
//
//    // 声明Bike类型的变量，并进行赋值
//    protected Bike bike = new Bike();
//
//    public abstract void buildFrame();
//
//    public abstract void buildSeat();
//
//    //构建自行车
//    public abstract Bike createBike();
//}


