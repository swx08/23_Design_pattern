package Proxy.demo2;

/**
 * ClassName:UserServiceImpl
 * Package:Proxy.demo2
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/4/22 - 10:35
 * @Version:v1.0
 */

/**
 * 真实角色
 */
public class UserServiceImpl implements UserService{
    @Override
    public void add() {
        System.out.println("add方法");
    }

    @Override
    public void delete() {
        System.out.println("delete方法");
    }

    @Override
    public void update() {
        System.out.println("update方法");
    }

    @Override
    public void query() {
        System.out.println("query方法");
    }
}
