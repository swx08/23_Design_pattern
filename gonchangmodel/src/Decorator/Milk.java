package Decorator;

/**
 * ClassName:Chocolate
 * Package:Decorator
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/5/12 - 16:54
 * @Version:v1.0
 */

/**
 * decorator的具体子类：牛奶调料品
 */
public class Milk extends Decorator{

    public Milk(Drink drink) {
        super(drink);
        setDescription("牛奶调料品");
        setPrice(3.5f);
    }
}
