package SingLeton;

import org.junit.jupiter.api.Test;


public class SingLeton {

    @Test
    public void test1(){
        HungrySingLeton instance = HungrySingLeton.getInstance();
        HungrySingLeton instance1 = HungrySingLeton.getInstance();
        System.out.println(instance == instance1);
    }

}
