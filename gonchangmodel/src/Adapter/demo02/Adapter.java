package Adapter.demo02;

/**
 * ClassName:Adapter
 * Package:Adapter
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/4/13 - 17:15
 * @Version:v1.0
 */


/**
 * 对象适配器：组合方式
 * 具体的适配器类：这是类适配器的写法
 */
public class Adapter implements NetToUsb {
    //将要求被适配的类：网线组合进来
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void handleRequest() {
        adaptee.request();
    }
}
