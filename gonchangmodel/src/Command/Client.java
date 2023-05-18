package Command;

/**
 * ClassName:Client
 * Package:Command
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/5/14 - 10:34
 * @Version:v1.0
 */

/**
 * 测试
 */
public class Client {
    public static void main(String[] args) {
        //使用命令模式，完成通过遥控器，对电灯的操作

        //创建电灯的对象(接收者，命令执行者)
        LightReceiver lightReceiver = new LightReceiver();

        //创建电灯相关的命令
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);

        //需要一个遥控器,初始化空命令
        RemoteController remoteController = new RemoteController();

        //通过命令对电灯进行控制
        remoteController.setCommand(0,lightOnCommand,lightOffCommand);

        System.out.println("--------按下灯的开按钮---------");
        remoteController.onButtonWasPushed(0);
        System.out.println("--------按下灯的关按钮---------");
        remoteController.offButtonWasPushed(0);
        System.out.println("--------按下灯的撤销按钮---------");
        remoteController.undoButtonWasPushed();

        //输出结果
        //--------按下灯的开按钮---------
        // 电灯打开了....
        //--------按下灯的关按钮---------
        //电灯关闭了....
        //--------按下灯的撤销按钮---------
        // 电灯打开了....
    }
}
