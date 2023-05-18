package Facade;

/**
 * ClassName:Client
 * Package:Facade
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/5/13 - 8:36
 * @Version:v1.0
 */

/**
 * 测试
 */
public class Client {
    public static void main(String[] args) {
        HomeMoveFacade homeMoveFacade = new HomeMoveFacade();
        //子系统开机工作
        homeMoveFacade.ready();
        System.out.println("--------------------------");
        //子系统开始工作
        homeMoveFacade.play();
        System.out.println("--------------------------");
        //子系统暂停工作
        homeMoveFacade.pause();
        System.out.println("--------------------------");
        //子系统关机
        homeMoveFacade.end();

        //输出结果
        //DVD 开机
        //爆米花机 开机
        //投影仪 开机
        //--------------------------
        //DVD 播放...
        //爆米花机 工作...
        //投影仪 聚焦....
        //--------------------------
        //DVD 暂停...
        //爆米花机 暂停
        //投影仪 聚焦暂停
        //--------------------------
        //DVD 关机
        //爆米花机 关机
        //投影仪 关机
    }
}
