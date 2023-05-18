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
 * decorator的具体子类：巧克力调料品
 */
public class Chocolate extends Decorator{

    public Chocolate(Drink drink) {
        super(drink);
        setDescription("巧克力调料品");
        setPrice(3.0f);
    }
}
