package Decorator;

/**
 * ClassName:Coffee
 * Package:Decorator
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/5/12 - 16:32
 * @Version:v1.0
 */

/**
 * 饮料的具体子类：单品咖啡
 */
public class Coffee extends Drink{
    /**
     * 因为是单品咖啡，所以直接返回父类的价格即可。
     * @return
     */
    @Override
    public float cost() {
        return super.getPrice();
    }
}
