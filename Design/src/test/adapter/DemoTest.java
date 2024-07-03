package adapter;

import adapter.class_adapter.Computer;
import adapter.class_adapter.SDAdapterTF;
import adapter.class_adapter.SDCard;
import adapter.class_adapter.SDCardImpl;
import adapter.object_adapter.TFCard;
import adapter.object_adapter.TFCardImpl;
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


    @Test
    public void object_Adapter(){
        adapter.object_adapter.Computer computer = new adapter.object_adapter.Computer();
        adapter.object_adapter.SDCard sdCard = new adapter.object_adapter.SDCardImpl();
        System.out.println(computer.readSD(sdCard));
        System.out.println("------------------------------");

        TFCard tfCard = new TFCardImpl();
        adapter.object_adapter.SDAdapterTF sdAdapterTF = new adapter.object_adapter.SDAdapterTF(tfCard);
        System.out.println(computer.readSD(sdAdapterTF));
    }
}
