package singLeton;

////饿汉式单例，成员变量模式
//public class HungrySingLeton {
//    //构造器私有
//    private HungrySingLeton(){};
//
//    //提供对象
//    private static HungrySingLeton instance= new HungrySingLeton();
//
//    //提供访问方法
//    public static HungrySingLeton getInstance(){
//        return instance;
//    }
//}

//饿汉式单例，静态代码块模式
public class HungrySingLeton {
    //构造器私有
    private HungrySingLeton(){};

    //提供对象
    private static HungrySingLeton instance;

    static {
        instance = new HungrySingLeton();
    }
    //提供访问方法
    public static HungrySingLeton getInstance(){
        return instance;
    }
}
