package Proxy.demo4;

/**
 * ClassName:Client
 * Package:Proxy.demo4
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/4/22 - 12:52
 * @Version:v1.0
 */

/**
 * 测试
 */
public class Client {
    public static void main(String[] args) {
        //真实角色
        UserServiceImpl userService = new UserServiceImpl();
        //代理类，现在没有
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        pih.setUserService(userService);
        //得到代理类
        UserService proxy = (UserService) pih.getProxy();
        proxy.query();
        //输出结果
        //执行了query方法
        //query方法
    }
}
