package Proxy.demo3;

/**
 * ClassName:Client
 * Package:Proxy.demo3
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/4/22 - 12:37
 * @Version:v1.0
 */

/**
 * 测试
 */
public class Client {
    public static void main(String[] args) {
        //真实角色房东
        Host host = new Host();
        //代理角色，现在没有
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        pih.setRent(host);
        //得到代理类(中介)，中介替房东执行rent().
        Rent proxy = (Rent) pih.getProxy();
        proxy.rent();
        //输出结果
        //中介带你看房子
        //收中介费
        //房东出租房子
    }
}
