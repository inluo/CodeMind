package command;

/**
 * 命令模式
 */
public class Client {
    public static void main(String[] args) {
        //创造订单
        Order order1 = new Order();
        order1.setDiningTable(1);
        order1.setFoodDic("西红柿炒鸡蛋",1);
        order1.setFoodDic("百事可乐",2);

        Order order2 = new Order();
        order2.setDiningTable(2);
        order2.setFoodDic("红烧肉",1);
        order2.setFoodDic("啤酒",2);

        //创建厨师
        SeniorChef chef = new SeniorChef();

        //构建订单命令
        OrderCommand command = new OrderCommand(chef,order1);
        OrderCommand command2 = new OrderCommand(chef,order2);

        //创建服务员
        Waitor waitor = new Waitor();
        //添加订单命令
        waitor.setCommand(command);
        waitor.setCommand(command2);
        //执行
        waitor.orderUp();
    }
}
