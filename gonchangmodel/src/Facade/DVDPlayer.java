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
 * DVD子系统
 */
public class DVDPlayer {
    //采用饿汉式单例模式
    private DVDPlayer(){};

    private static DVDPlayer instance = new DVDPlayer();

    public static DVDPlayer getInstance(){
        return instance;
    }

    //开机方法
    public void on(){
        System.out.println("DVD 开机");
    }

    //关机方法
    public void off(){
        System.out.println("DVD 关机");
    }

    //播放方法
    public void play(){
        System.out.println("DVD 播放...");
    }

    //结束方法
    public void pause(){
        System.out.println("DVD 暂停...");
    }
}
