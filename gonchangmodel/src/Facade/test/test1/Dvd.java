package Facade.test.test1;

import java.sql.SQLOutput;

/**
 * ClassName:Dvd
 * Package:Facade.test.test1
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/5/13 - 13:26
 * @Version:v1.0
 */
public class Dvd {
    private Dvd(){};
    private static Dvd instance = new Dvd();

    public static Dvd getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("dvd 开机");
    }
    public void play(){
        System.out.println("dvd 播放");
    }
    public void pause(){
        System.out.println("dvd 暂停");
    }
    public void end(){
        System.out.println("dvd 关机");
    }
}
