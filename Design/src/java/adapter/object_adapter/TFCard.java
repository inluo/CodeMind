package adapter.object_adapter;

//SD卡的接口
public interface TFCard {
    //读取SD卡方法
    String readTF();
    //写入SD卡功能
    void writeTF(String msg);
}
