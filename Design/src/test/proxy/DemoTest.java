package proxy;

import org.junit.jupiter.api.Test;
import proxy.cglib_proxy.CglibProxyFactory;
import proxy.cglib_proxy.TrainStation;
import proxy.jdk_proxy.ProxyFactory;
import proxy.jdk_proxy.SellTickets;
import proxy.static_proxy.ProxyPoint;

public class DemoTest {
    @Test
    public void test(){
        ProxyPoint pp = new ProxyPoint();
        pp.sell();
    }

    @Test
    public void test1() {
        //获取代理对象
        ProxyFactory factory = new ProxyFactory();

        SellTickets proxyObject = factory.getProxyObject();
        proxyObject.sell();
        System.out.println(proxyObject.getClass());

    }

    @Test
    public void cglib(){
        //创建代理工厂对象
        CglibProxyFactory proxyFactory = new CglibProxyFactory();
        //获取代理对象
        TrainStation station = proxyFactory.getProxyObject();

        station.sell();
    }
}
