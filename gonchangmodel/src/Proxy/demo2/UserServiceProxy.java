package Proxy.demo2;

/**
 * ClassName:UserServiceProxy
 * Package:Proxy.demo2
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/4/22 - 10:37
 * @Version:v1.0
 */

/**
 * 代理角色
 * 业务需求，在原有的增删改查功能代码之上加入日志，不改动原有代码。
 * 代码直接加在代理角色类中，这样就不用改动原有代码了。
 */
public class UserServiceProxy implements UserService{
    //组合抽象角色
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void add() {
        log("add");
        userService.add();
    }

    @Override
    public void delete() {
        log("delete");
        userService.delete();
    }

    @Override
    public void update() {
        log("update");
        userService.update();
    }

    @Override
    public void query() {
        log("query");
        userService.query();
    }

    public void log(String meg){
        System.out.println("使用了" + meg + "方法");
    }
}
