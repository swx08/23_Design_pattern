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
 * 玩具鸭
 */
public class ToyDuck extends Duck{

    public ToyDuck(){
        //玩具鸭不会飞翔
        flyBehavior = new NoFlyBehavior();
    }

    @Override
    public void disPlay() {
        System.out.println("这是玩具鸭！");
    }
}
