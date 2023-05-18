package Command;

/**
 * ClassName:Command
 * Package:Command
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/5/14 - 9:57
 * @Version:v1.0
 */

/**
 * 所有的命令都在这个接口中
 */
public interface Command {
    //执行操作
    public void execute();
    //撤销操作
    public void undo();
}
