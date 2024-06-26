package proxy;

import org.junit.jupiter.api.Test;
import proxy.static_proxy.ProxyPoint;

public class DemoTest {
    @Test
    public void test(){
        ProxyPoint pp = new ProxyPoint();
        pp.sell();
    }
}
