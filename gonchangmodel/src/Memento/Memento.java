package Memento;

/**
 * ClassName:Memento
 * Package:Memento
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/5/16 - 21:39
 * @Version:v1.0
 */

/**
 * 备忘录对象
 */
public class Memento {
    //攻击力
    private int vit;
    //防御力
    private int def;

    public Memento(int vit, int def) {
        this.vit = vit;
        this.def = def;
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
