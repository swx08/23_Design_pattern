package Builder.demo02;

/**
 * ClassName:Client
 * Package:Builder.demo02
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/4/11 - 22:59
 * @Version:v1.0
 */

import Builder.demo02.Product;

/**
 *具体的建造者，因为无指挥者，所以客户就充当着指挥者的作用
 */
public class Client extends Builder{

    private Product product;
    public Client(){
        product = new Product();
    }

    @Override
    Builder buildA(String msg) {
        product.setBuildA(msg);
        return this;
    }

    @Override
    Builder buildB(String msg) {
        product.setBuildB(msg);
        return this;
    }

    @Override
    Builder buildC(String msg) {
        product.setBuildC(msg);
        return this;
    }

    @Override
    Builder buildD(String msg) {
        product.setBuildD(msg);
        return this;
    }

    @Override
    Product getProduct() {
        return product;
    }
}
