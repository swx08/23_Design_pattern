package Proxy.demo5;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.EmptyStackException;

/**
 * ClassName:ProxyInvocationHandler
 * Package:Proxy.demo5
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/4/22 - 13:03
 * @Version:v1.0
 */

/**
 * 万能自动生成代理类工具包
 */
public class ProxyInvocationHandler implements InvocationHandler {
    //被代理接口
    private Object target;

    public void setTarget(Object target){
        this.target = target;
    }

    //生成代理类
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),
                                      target.getClass().getInterfaces(),
                                      this);
    }

    //处理代理实例，并返回结果
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //动态代理
        Object invoke = method.invoke(target, args);
        return invoke;
    }
}
