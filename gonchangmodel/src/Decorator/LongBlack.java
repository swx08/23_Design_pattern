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
 * 咖啡的具体子类：美式咖啡
 */
public class LongBlack extends Coffee{
    public LongBlack(){
        setDescription("美式咖啡--LongBlack");
        setPrice(5.0f);
    }
}
