package Prototype;

//原型模式，深克隆
public class School implements Cloneable{
    private Universal universal;

    public void show(){
        System.out.println(universal.getName());
    }

    public Universal getUniversal() {
        return universal;
    }

    public void setUniversal(Universal universal) {
        this.universal = universal;
    }

    @Override
    public School clone() throws CloneNotSupportedException {
        return (School) super.clone();
    }
}
