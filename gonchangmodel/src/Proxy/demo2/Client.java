package Proxy.demo2;

/**
 * ClassName:Client
 * Package:Proxy.demo2
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/4/22 - 10:43
 * @Version:v1.0
 */

/**
 * 测试类
 */
public class Client {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        //使用代理模式
        UserServiceProxy userServiceProxy = new UserServiceProxy();
        userServiceProxy.setUserService(userService);
        userServiceProxy.add();
    }
}
