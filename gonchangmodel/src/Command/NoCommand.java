package Command;

/**
 * ClassName:NoCommand
 * Package:Command
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/5/14 - 10:17
 * @Version:v1.0
 */

/**
 * 没有任何命令，即空执行：用于初始化每个按钮，当调用空命令时，对象什么都不做，
 * 这样是一种设计模式，可以省略掉对空判断。
 */
public class NoCommand implements Command{
    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
