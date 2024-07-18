package flyweight;

public class Client {
    public static void main(String[] args) {
        BoxFactory box = BoxFactory.getInstance();

        AbstractBox i = box.getBox("I");
        i.display("红色");

        AbstractBox l = box.getBox("L");
        l.display("绿色");

        AbstractBox o = box.getBox("O");
        o.display("黄色");
        AbstractBox o1 = box.getBox("O");
        o1.display("红色");

        System.out.println(o==o1);
    }
}
