package Command;

/**
 * ClassName:LightOnCommand
 * Package:Command
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/5/14 - 10:01
 * @Version:v1.0
 */

/**
 * 打开电灯命令
 */
public class LightOnCommand implements Command{

    //聚合电灯，实际操作由电灯完成
    LightReceiver lightReceiver;

    public LightOnCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        //电灯打开操作
        lightReceiver.on();
    }

    @Override
    public void undo() {
        //撤销操作
        lightReceiver.off();
    }
}
