package builder;

/**
 * 指挥者类
 */
public class Director {
    //声明builder变量
    private Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    //组装自行车方法
    public Bike construct(){
        builder.buildFrame();
        builder.buildSeat();
        return builder.createBike();
    }
}
