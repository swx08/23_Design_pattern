package Facade;

/**
 * ClassName:HomeMoveFacade
 * Package:Facade
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/5/13 - 8:25
 * @Version:v1.0
 */

/**
 * 外观模式
 * 家庭影院：高层接口，被client直接调用
 */
public class HomeMoveFacade {
    //核心：聚合各个子系统
    private DVDPlayer dvdPlayer;
    private Popcorn popcorn;
    private  Projector projector;

    //初始化子系统
    public HomeMoveFacade() {
        this.dvdPlayer = DVDPlayer.getInstance();
        this.popcorn = Popcorn.getInstance();
        this.projector = Projector.getInstance();
    }

    //做准备工作
    public void ready(){
        //dvd开机
        dvdPlayer.on();
        //爆米花机开机
        popcorn.on();
        //投影仪开机
        projector.on();
    }

    //开始进行工作
    public void play(){
        //dvd播放
        dvdPlayer.play();
        //爆米花机工作
        popcorn.pop();
        //投影仪开始聚焦
        projector.focus();
    }

    //暂停
    public void pause(){
        dvdPlayer.pause();
        popcorn.pause();
        projector.pause();
    }

    //关机
    public void end(){
        //dvd播放关机
        dvdPlayer.off();
        //爆米花机关机
        popcorn.off();
        //投影仪关机
        projector.off();
    }
}
