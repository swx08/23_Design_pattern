package Command;

/**
 * ClassName:RemoteController
 * Package:Command
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/5/14 - 10:20
 * @Version:v1.0
 */

/**
 * 命令调用者
 */
public class RemoteController {
    //打开和关闭按钮的数组
    Command[] onCommands;
    Command[] offCommands;

    //执行撤销的命令
    Command undoCommand;

    //初始化命令
    public RemoteController(){
        onCommands = new Command[5];
        offCommands = new Command[5];

        //初始化命令，刚开始时，执行空命令
        for(int i = 0; i < 5; i++){
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }
    //给按钮设置你需要的命令
    public void setCommand(int num,Command onCommand,Command offCommand){
        onCommands[num] = onCommand;
        offCommands[num] = offCommand;
    }

    //按下开按钮
    public void onButtonWasPushed(int num){
        //找到你按下的开的按钮，并调用对应方法
        onCommands[num].execute();
        //记录日志，便于撤销
        undoCommand = onCommands[num];
    }

    //按下关按钮
    public void offButtonWasPushed(int num){
        //找到你按下的关的按钮，并调用对应方法
        offCommands[num].execute();
        //记录日志，便于撤销
        undoCommand = offCommands[num];
    }

    //按下撤销命令
    public void undoButtonWasPushed(){
        //执行撤销操作
        undoCommand.undo();
    }

}
