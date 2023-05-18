package Proxy.demo3;

/**
 * ClassName:ProxyInvocationHandler
 * Package:Proxy.demo3
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/4/22 - 12:28
 * @Version:v1.0
 */

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 等会儿我们会使用这个类，自动生成代理类
 */
public class ProxyInvocationHandler implements InvocationHandler {
    //被代理接口
    private Rent rent;

    public void setRent(Rent rent){
        this.rent = rent;
    }

    //生成得到代理类
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),//当前类加载器
                                      rent.getClass().getInterfaces(),//被代理接口
                                    this);//InvocationHandler对象
    }

    //处理代理实例，并返回结果
    @Override
    public Object invoke(Object proxy,
                         Method method,
                         Object[] args) throws Throwable {
        //动态代理的实质，就是使用反射机制实现
        seeHouse();
        fare();
        Object invoke = method.invoke(rent, args);
        return invoke;
    }
    //代理类的额外附属工作
    public void seeHouse(){
        System.out.println("中介带你看房子");
    }

    public void fare(){
        System.out.println("收中介费");
    }
}
