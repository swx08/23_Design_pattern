package Strategy;

/**
 * ClassName:Duck
 * Package:Strategy
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/5/15 - 22:06
 * @Version:v1.0
 */

/**
 * 算法的使用者：鸭子类
 */
public abstract class Duck {
    //属性，策略接口
    FlyBehavior flyBehavior;
    //可以添加其他策略接口

    /**
     * 显示鸭子信息
     */
    public abstract void disPlay();

    //动态设置某个对象的飞翔行为
    public void setFlyBehavior(FlyBehavior flyBehavior){
        this.flyBehavior = flyBehavior;
    }

    public void swim(){
        System.out.println("鸭子游泳~");
    }

    public void fly(){
        if(flyBehavior != null){
            flyBehavior.fly();
        }
    }
}
