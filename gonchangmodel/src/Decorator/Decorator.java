package Decorator;

/**
 * ClassName:Decorator
 * Package:Decorator
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/5/12 - 16:44
 * @Version:v1.0
 */

import com.sun.org.glassfish.gmbal.Description;

/**
 * 装饰者 ： 调料
 */
public class Decorator extends Drink{
    //装饰者核心就是继承了被装饰者同时组合了被装饰者
    private Drink drink;

    public Decorator(Drink drink){
        this.drink = drink;
    }

    //费用 = 具体调料  + 具体饮料
    @Override
    public float cost() {
        //调料品 + 饮料 的费用
        return super.getPrice() + drink.cost();
    }

    @Override
    public String getDescription() {
        return getDescription() + " " + getPrice() + "&&" + drink.getDescription();
    }
}
