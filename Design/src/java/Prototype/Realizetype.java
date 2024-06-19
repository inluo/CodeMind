package Prototype;

//原型模式
public class Realizetype implements Cloneable{

    public Realizetype() {
        System.out.println("原型对象创建完成");
    }

    //Java中的Cloneable充当抽象原型类
    @Override
    protected Realizetype clone() throws CloneNotSupportedException {
        System.out.println("复制成功完成");
        return (Realizetype) super.clone();
    }
}
