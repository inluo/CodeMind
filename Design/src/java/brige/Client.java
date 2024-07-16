package brige;

//桥接模式测试
public class Client {
    public static void main(String[] args) {
        OperatingSystemVersion os = new Windows(new AVFile());
        os.play("桥接模式在构造器传入所需要的对象，一个抽象类聚合另一个接口类作为属性");
    }
}
