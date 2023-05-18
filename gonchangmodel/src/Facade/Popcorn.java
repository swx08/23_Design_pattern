package Facade;

/**
 * ClassName:DVDPlayer
 * Package:Facade
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/5/13 - 8:07
 * @Version:v1.0
 */

/**
 * 爆米花机子系统
 */
public class Popcorn {
    //采用饿汉式单例模式
    private Popcorn(){};

    private static Popcorn instance = new Popcorn();

    public static Popcorn getInstance(){
        return instance;
    }

    //开机方法
    public void on(){
        System.out.println("爆米花机 开机");
    }

    //关机方法
    public void off(){
        System.out.println("爆米花机 关机");
    }

    public void pop(){
        System.out.println("爆米花机 工作...");
    }

    //赞停
    public void pause(){
        System.out.println("爆米花机 暂停");
    }
}
