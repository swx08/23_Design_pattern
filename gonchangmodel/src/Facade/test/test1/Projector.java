package Facade.test.test1;

/**
 * ClassName:Dvd
 * Package:Facade.test.test1
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/5/13 - 13:26
 * @Version:v1.0
 */
public class Projector {
    private Projector(){};
    private static Projector instance = new Projector();

    public static Projector getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("Projector 开机");
    }
    public void focus(){
        System.out.println("Projector 播放");
    }
    public void pause(){
        System.out.println("Projector 暂停");
    }
    public void end(){
        System.out.println("Projector 关机");
    }
}
