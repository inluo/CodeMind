package SingLeton;

import java.io.Serializable;

//懒汉式   静态内部类模式
public class LazySingLeton implements Serializable {
    private LazySingLeton() {};

    //key 内部类被调用时才被加载
    private static class SingLeton{
        private static final LazySingLeton INSTANCE = new LazySingLeton();
    }

    //对外暴露，返回内部类的对象
    public static LazySingLeton getInstance(){
        return SingLeton.INSTANCE;
    }

    //反序列化时，自动调用此方法
    public Object readResolve(){
        return SingLeton.INSTANCE;
    }

}

//懒汉式   双重检查模式
//public class LazySingLeton {
//    private LazySingLeton() {};
//
//    private static LazySingLeton instance;
//
//    //对外暴露  添加synchronized避免线程冲突后单例失败
//    public static LazySingLeton getInstance(){
//        //key: 第一次判断如果instance不为null，直接返回，避免锁住整个方法
//        if (instance == null){
//            synchronized (LazySingLeton.class){
//                instance = new LazySingLeton();
//            }
//        }
//        return instance;
//    }
//}

////懒汉式   线程安全模式
//public class LazySingLeton {
//    private LazySingLeton() {};
//
//    private static LazySingLeton instance;
//
//    //对外暴露  添加synchronized避免线程冲突后单例失败
//    public static synchronized LazySingLeton getInstance(){
//        //第一次调用才加载，后续调用直接提供
//        if (instance == null){
//            instance = new LazySingLeton();
//        }
//
//        return instance;
//    }
//}
