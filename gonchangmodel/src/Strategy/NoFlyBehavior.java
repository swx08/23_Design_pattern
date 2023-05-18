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
 * 具体子类：不会飞翔
 */
public class NoFlyBehavior implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("不会飞翔~");
    }
}
