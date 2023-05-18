package Strategy;

/**
 * ClassName:WildDuck
 * Package:Strategy
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/5/15 - 22:08
 * @Version:v1.0
 */

/**
 * 野鸭
 */
public class WildDuck extends Duck{

    public WildDuck(){
        //野鸭飞翔技术高超
        flyBehavior = new GoodFlyBehavior();
    }

    @Override
    public void disPlay() {
        System.out.println("这是野鸭！");
    }
}
