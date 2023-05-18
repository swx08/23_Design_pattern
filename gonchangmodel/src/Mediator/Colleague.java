package Mediator;

/**
 * ClassName:Colleague
 * Package:Mediator
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/5/16 - 22:33
 * @Version:v1.0
 */

/**
 * 机器管理类：抽象类
 */
public abstract class Colleague {
    private Mediator mediator;
    private String name;

    public Colleague(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }
    //获取中介者
    public Mediator getMediator(){
        return this.mediator;
    }

    //发送消息
    public abstract void sendMessage(int stateChange);
}
