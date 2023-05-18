package Builder.demo01;

/**
 * ClassName:Builder
 * Package:Builder
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/4/11 - 22:04
 * @Version:v1.0
 */

/**
 * 抽象的建造者
 */
public abstract class Builder {
    //一下是四个建造步骤
    abstract void buildA(); //地基
    abstract void buildB(); //钢筋工程
    abstract void buildC(); //铺电线
    abstract void buildD(); //粉刷

    //得到具体的抽象的成品：房子
    abstract Product getProduct();
}
