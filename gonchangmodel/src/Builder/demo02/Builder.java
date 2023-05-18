package Builder.demo02;

/**
 * ClassName:Builder
 * Package:Builder.demo02
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/4/11 - 22:55
 * @Version:v1.0
 */

/**
 * 抽象建造类
 */
public abstract class Builder {
    abstract Builder buildA(String msg); //可乐
    abstract Builder buildB(String msg); //汉堡
    abstract Builder buildC(String msg); //薯条
    abstract Builder buildD(String msg); //甜点
    //得到抽象的成品：套餐
    abstract Product getProduct();
}
