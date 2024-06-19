package prototype;

//原型模式：三好学生类
public class Citation implements Cloneable{
    private String name;

    public void show(){
        System.out.println(name + "获得三好学生");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }
}
