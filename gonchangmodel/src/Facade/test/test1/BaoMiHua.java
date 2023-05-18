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
public class BaoMiHua {
    private BaoMiHua(){};
    private static BaoMiHua instance = new BaoMiHua();

    public static BaoMiHua getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("BaoMiHua 开机");
    }
    public void pop(){
        System.out.println("BaoMiHua 播放");
    }
    public void pause(){
        System.out.println("BaoMiHua 暂停服务");
    }
    public void end(){
        System.out.println("BaoMiHua 关机");
    }
}
