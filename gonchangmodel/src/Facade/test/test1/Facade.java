package Facade.test.test1;

/**
 * ClassName:facade
 * Package:Facade.test.test1
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/5/13 - 13:25
 * @Version:v1.0
 */
public class Facade {
    private Dvd dvd;
    private BaoMiHua baoMiHua;
    private Projector projector;
    public Facade(){
        this.dvd = Dvd.getInstance();
        this.baoMiHua = BaoMiHua.getInstance();
        this.projector = Projector.getInstance();
    }

    public void on(){
        dvd.on();
        baoMiHua.on();
        projector.on();
    }

    public void play(){
        dvd.play();
        baoMiHua.pop();
        projector.focus();
    }

    public void pause(){
        dvd.pause();
        baoMiHua.pause();
        projector.pause();
    }

    public void end(){
        dvd.end();
        baoMiHua.end();
        projector.end();
    }
}
