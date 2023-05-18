package Builder.demo01;

/**
 * ClassName:Director
 * Package:Builder
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/4/11 - 22:20
 * @Version:v1.0
 */

/**
 * 指挥者：核心，负责指挥如何构建一个工程？工程如何构建 由它决定
 */
public class Director {
    //指挥工人按照顺序建房子
    public Product buildProduct(Builder builder){
        builder.buildA();
        builder.buildB();
        builder.buildC();
        builder.buildD();
        return builder.getProduct();
    }
}
