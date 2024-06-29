package proxy.jdk_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//代理工厂
public class ProxyFactory {

    private TrainStation station = new TrainStation();

    public SellTickets getProxyObject(){
        //使用Proxy获取代理对象
        /*newProxyInstance()方法参数说明：
        ClassLoader loader ： 类加载器，用于加载代理类，使用真实对象的类加载器即可
        Class<?>[] interfaces ： 真实对象所实现的接口，代理模式真实对象和代理对象实现相同的接口
        key InvocationHandler h ： 代理对象的调用处理程序*/
        SellTickets sellTicket = (SellTickets) Proxy.newProxyInstance(station.getClass().getClassLoader(),
                station.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("代理点收取一些服务费用(JDK动态代理方式)");
                        //执行真实对象
                        Object result = method.invoke(station, args);
                        return result;
                    }
                });
        return sellTicket;
    }
}
