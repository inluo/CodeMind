package adapter.object_adapter;

public class TFCardImpl implements TFCard {
    @Override
    public String readTF() {
        String msg = "tf card read a msg :hello word TF";
        return msg;
    }

    @Override
    public void writeTF(String msg) {
        System.out.println("tf card write msg : " + msg);
    }
}
