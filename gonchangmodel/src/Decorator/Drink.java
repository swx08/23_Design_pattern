package Decorator;

/**
 * ClassName:Drink
 * Package:Decorator
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/5/12 - 16:24
 * @Version:v1.0
 */

/**
 * 装饰者模式
 * 被装饰者：抽象类：饮料
 */
public abstract class Drink {
    //描述
    private String description;
    //价格
    private float price = 0.0f;

    //计算费用抽象方法，有子类来实现
    public abstract float cost();

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
