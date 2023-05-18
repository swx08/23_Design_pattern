package Strategy;

/**
 * ClassName:FlyBehavior
 * Package:Strategy
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/5/15 - 21:59
 * @Version:v1.0
 */

/**
 * 算法的提供者：鸭子飞翔的接口
 */
public interface FlyBehavior {
    //飞翔技术咋样由具体子类实现
    void fly();
}
