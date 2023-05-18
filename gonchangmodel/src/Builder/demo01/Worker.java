package Builder.demo01;

/**
 * ClassName:Worker
 * Package:Builder
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/4/11 - 22:15
 * @Version:v1.0
 */

/**
 * 具体的建造者：工人
 */
public class Worker extends Builder{
    private Product product;
    //注意：工人创建产品
    public Worker(){
        product = new Product();
    }

    @Override
    void buildA() {
        product.setBuildA("地基");
        System.out.println("地基");
    }

    @Override
    void buildB() {
        product.setBuildA("钢筋工程");
        System.out.println("钢筋工程");
    }

    @Override
    void buildC() {
        product.setBuildC("铺电线");
        System.out.println("铺电线");
    }

    @Override
    void buildD() {
        product.setBuildD("粉刷");
        System.out.println("粉刷");
    }

    @Override
    Product getProduct() {
        return product;
    }
}
