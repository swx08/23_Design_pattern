package Memento;

/**
 * ClassName:CareTaker
 * Package:Memento
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/5/16 - 21:42
 * @Version:v1.0
 */

import java.util.ArrayList;
import java.util.HashMap;

/**
 * 守护者对象，用来保存游戏角色的状态
 */
public class CareTaker {
    //如果只保存一次状态
    private Memento memento;
    //对一个游戏角色保存多次状态
    //private ArrayList<Memento> mementos;
    //对多个游戏角色保存多次状态
    //private HashMap<String,ArrayList<Memento>> roleMementos;


    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
