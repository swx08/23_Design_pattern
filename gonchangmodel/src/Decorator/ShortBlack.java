package Decorator;

/**
 * ClassName:LongBack
 * Package:Decorator
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/5/12 - 16:37
 * @Version:v1.0
 */

/**
 * 咖啡的具体子类：加式咖啡
 */
public class ShortBlack extends Coffee{
    public ShortBlack(){
        setDescription("加式咖啡--ShortBlack");
        setPrice(8.0f);
    }
}
