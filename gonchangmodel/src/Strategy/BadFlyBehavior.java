package Strategy;

/**
 * ClassName:GoodFlyBehavior
 * Package:Strategy
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/5/15 - 22:00
 * @Version:v1.0
 */

/**
 * 具体子类：飞翔技术一般
 */
public class BadFlyBehavior implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("飞翔技术一般~");
    }
}
