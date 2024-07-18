package flyweight;

public abstract class AbstractBox {
    public abstract String getShape();

    public void display(String color) {
        System.out.println("享元模式，方块形状：" + this.getShape() + " 颜色：" + color);
    }
}
