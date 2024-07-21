package strategy;


/**
 * 策略模式？：环境角色类聚合策略类，
 * key:构建时传入具体策略类
 */
public class Client {
    public static void main(String[] args) {
        SalesMan salesMan = new SalesMan(new StrategyA());
        salesMan.salesManShow();
    }

}
