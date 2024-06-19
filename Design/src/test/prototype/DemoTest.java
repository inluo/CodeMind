package prototype;

import org.junit.jupiter.api.Test;

public class DemoTest {

    @Test
    public void Test1() throws CloneNotSupportedException {
        Realizetype realizetype = new Realizetype();

        Realizetype realizetype1 = realizetype.clone();

        System.out.println(realizetype == realizetype1);
    }

    @Test
    public void Test2() throws CloneNotSupportedException {
        Citation citation = new Citation();
        Citation citation1 = citation.clone();

        citation.setName("张三");
        citation1.setName("李四");

        citation.show();
        citation1.show();
    }

    @Test
    public void Test3() throws CloneNotSupportedException {
        School school = new School();
        Universal universal = new Universal();
        universal.setName("清华大学");
        school.setUniversal(universal);

        //直接克隆，里面的引用对象指向同一个，是浅克隆
//        School school1 = school.clone();
//        Universal universal1 = school1.getUniversal();
//        universal1.setName("北京大学");
//
//        school.show();
//        school1.show();
    }
}
