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
 * decorator的具体子类：豆浆调料品
 */
public class Soy extends Decorator{

    public Soy(Drink drink) {
        super(drink);
        setDescription("豆浆调料品");
        setPrice(2.5f);
    }
}
