package adapter.object_adapter;

//TF卡接口
public interface SDCard {
    //读取TF卡方法
    String readSD();
    //写入TF卡功能
    void writeSD(String msg);
}
