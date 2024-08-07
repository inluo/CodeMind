package builder;

import builder.chain.Computer;
import org.junit.jupiter.api.Test;

public class DemoTest {
    @Test
    public void Test1(){
        //创建指挥者对象
        Director director = new Director(new OfoBuilder());

        //指挥者组装自行车
        Bike bike = director.construct();
        System.out.println(bike.getFrame());
        System.out.println(bike.getSeat());
    }

    @Test
    public void Test2(){
        //创建指挥者对象
        Builder builder = new MobileBuilder();

        //指挥者组装自行车
        Bike bike = builder.construct();
        System.out.println(bike.getFrame());
        System.out.println(bike.getSeat());
    }


    @Test
    public void  Test3(){
        Computer computer = new Computer.Builder()
                .cpu("AMD")
                .memory("长鑫")
                .mainboard("华硕")
                .screen("三星")
                .build();
        System.out.println(computer.toString());
    }
}
