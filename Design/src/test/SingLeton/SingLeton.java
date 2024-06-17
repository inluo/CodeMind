package SingLeton;

import org.junit.jupiter.api.Test;


public class SingLeton {

    @Test
    public void test1(){
        HungrySingLeton instance = HungrySingLeton.getInstance();
        HungrySingLeton instance1 = HungrySingLeton.getInstance();
        System.out.println(instance == instance1);
    }

    @Test
    public void test2(){
        LazySingLeton instance = LazySingLeton.getInstance();
        LazySingLeton instance1 = LazySingLeton.getInstance();
        System.out.println(instance == instance1);
    }

    @Test
    public void test3(){
        SingLetonEnum instance = SingLetonEnum.INSTANCE;
        SingLetonEnum instance1 = SingLetonEnum.INSTANCE;
        System.out.println(instance == instance1);
    }

}
