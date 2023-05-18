package Decorator;

/**
 * ClassName:Espresso
 * Package:Decorator
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/5/12 - 16:34
 * @Version:v1.0
 */

/**
 * 咖啡的具体子类：意大利咖啡
 */
public class Espresso extends Coffee{
    /**
     * 给意大利咖啡初始化描述及价格
     */
    public Espresso(){
        setDescription("意大利咖啡--Espresso");
        setPrice(6.0f);
    }
}
