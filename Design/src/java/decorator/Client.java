package decorator;

//测试类
public class Client {
    public static void main(String[] args) {
        FastFood food = new FriedRice();
        System.out.println(food.getDesc() + "" + food.cost() + "元");

        FastFood food1 = new FriedRice();
        food1 = new Egg(food1);
        //加鸡蛋花费的价格
        System.out.println(food1.getDesc() + " " + food1.cost() + "元");
        //继续加培根
        food1 = new Bacon(food1);
        //花费的价格
        System.out.println(food1.getDesc() + " " + food1.cost() + "元");
    }
}
