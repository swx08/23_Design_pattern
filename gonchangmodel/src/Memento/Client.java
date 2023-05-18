package Memento;

/**
 * ClassName:Client
 * Package:Memento
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/5/16 - 21:55
 * @Version:v1.0
 */

/**
 * 测试类
 */
public class Client {
    public static void main(String[] args) {

        //创建游戏角色
        GameRole gameRole = new GameRole();
        gameRole.setVit(100);
        gameRole.setDef(100);
        System.out.println("和boss大战前的状态");
        gameRole.disPlay();

        //将当前状态保存到CareTaker中
        CareTaker careTaker = new CareTaker();
        careTaker.setMemento(gameRole.crateMemento());

        System.out.println("和boss大战~");
        gameRole.setVit(35);
        gameRole.setDef(35);

        gameRole.disPlay();

        System.out.println("大战后，使用备忘录对象恢复到大战前");
        gameRole.recoverGameRoleFromMemento(careTaker.getMemento());
        gameRole.disPlay();

        //输出结果
        //和boss大战前的状态
        //当前角色的攻击力为：100，防御力为：100
        //和boss大战~
        //当前角色的攻击力为：35，防御力为：35
        //大战后，使用备忘录对象恢复到大战前
        //当前角色的攻击力为：100，防御力为：100
    }
}
