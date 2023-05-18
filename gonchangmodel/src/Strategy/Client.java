package Strategy;

/**
 * ClassName:Client
 * Package:Strategy
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/5/15 - 22:16
 * @Version:v1.0
 */

/**
 * 测试类
 */
public class Client {
    public static void main(String[] args) {
        //野鸭
        WildDuck wildDuck = new WildDuck();
        wildDuck.fly();

        //北京鸭
        PekingDuck pekingDuck = new PekingDuck();
        pekingDuck.fly();

        //玩具鸭
        ToyDuck toyDuck = new ToyDuck();
        toyDuck.fly();

        //动态设置玩具鸭的飞翔行为，玩具鸭原本不会飞，现在动态设置成可以飞
        toyDuck.setFlyBehavior(new GoodFlyBehavior());
        System.out.println("玩具鸭新设置的飞翔技能------------");
        toyDuck.fly();

        //输出结果
        //飞翔技术高超~
        //飞翔技术一般~
        //不会飞翔~
        //玩具鸭新设置的飞翔技能------------
        //飞翔技术高超~
    }
}
