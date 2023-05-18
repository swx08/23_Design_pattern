package Proxy.demo4;

/**
 * ClassName:ProxyInvocationHandler
 * Package:Proxy.demo3
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/4/22 - 12:28
 * @Version:v1.0
 */

import Proxy.demo3.Rent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 等会儿我们会使用这个类，自动生成代理类
 */
public class ProxyInvocationHandler implements InvocationHandler {
    //被代理的接口
    private UserService userService;

    public void setUserService(UserService userService){
        this.userService = userService;
    }

    //自动生成代理类
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),
                                      userService.getClass().getInterfaces(),
                                      this);
    }

    //处理代理类，并返回结果
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //动态代理实质就是反射机制实现
        log(method.getName());//使用反射获取执行方法的名称
        Object invoke = method.invoke(userService, args);
        return invoke;
    }

    //日志输出
    public void log(String meg){
        System.out.println("执行了" + meg + "方法");
    }
}
