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
 * 投影仪子系统
 */
public class Projector {
    //采用饿汉式单例模式
    private Projector(){};

    private static Projector instance = new Projector();

    public static Projector getInstance(){
        return instance;
    }

    //开机方法
    public void on(){
        System.out.println("投影仪 开机");
    }

    //关机方法
    public void off(){
        System.out.println("投影仪 关机");
    }

    //聚焦方法
    public void focus(){
        System.out.println("投影仪 聚焦....");
    }

    //结束
    public void pause(){
        System.out.println("投影仪 聚焦暂停");
    }
}
