package Proxy.demo5;

/**
 * ClassName:Client
 * Package:Proxy.demo5
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/4/22 - 13:09
 * @Version:v1.0
 */

import Proxy.demo3.Host;
import Proxy.demo3.Rent;
import Proxy.demo4.UserService;
import Proxy.demo4.UserServiceImpl;

/**
 * 测试
 */
public class Client {
    public static void main(String[] args) {
        //真实角色
        Host host = new Host();
        //代理类，现在还没有
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        pih.setTarget(host);
        //得到代理类
        Rent proxy = (Rent) pih.getProxy();
        proxy.rent();

        //真实角色
        UserServiceImpl userService = new UserServiceImpl();
        //代理类，现在还没有
        pih.setTarget(userService);
        //得到代理类
        UserService proxy1 = (UserService) pih.getProxy();
        proxy1.add();
    }
}
