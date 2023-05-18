package Memento;

/**
 * ClassName:GameRole
 * Package:Memento
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/5/16 - 21:48
 * @Version:v1.0
 */

/**
 * 游戏角色
 */
public class GameRole {

    private int vit;
    private int def;

    //创建Memento,根据当前的状态得到Memento
    public Memento crateMemento(){
        return new Memento(this.vit,this.def);
    }

    //从备忘录对象恢复到GameRole的状态
    public void recoverGameRoleFromMemento(Memento memento){
        this.vit = memento.getVit();
        this.def = memento.getDef();
    }

    //显示当前角色的状态
    public void disPlay(){
        System.out.println("当前角色的攻击力为：" + this.vit + "，防御力为：" + this.def);
    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
