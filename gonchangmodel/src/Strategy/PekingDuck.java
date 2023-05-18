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
 * 北京鸭
 */
public class PekingDuck extends Duck{

    public PekingDuck(){
        //北京鸭飞翔技术一般
        flyBehavior = new BadFlyBehavior();
    }

    @Override
    public void disPlay() {
        System.out.println("这是北京鸭！");
    }
}
