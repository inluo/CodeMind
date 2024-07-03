package adapter;

import adapter.class_adapter.Computer;
import adapter.class_adapter.SDAdapterTF;
import adapter.class_adapter.SDCard;
import adapter.class_adapter.SDCardImpl;
import org.junit.jupiter.api.Test;

public class DemoTest {

    @Test
    public void classAdapter(){
        Computer computer = new Computer();
        SDCard sdCard = new SDCardImpl();
        System.out.println(computer.readSD(sdCard));
        System.out.println("------------------------------");

        SDAdapterTF sdAdapterTF = new SDAdapterTF();
        System.out.println(computer.readSD(sdAdapterTF));
    }
}
