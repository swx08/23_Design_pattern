package State;

/**
 * ClassName:NoRallfeState
 * Package:State
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/5/15 - 23:01
 * @Version:v1.0
 */

/**
 * 奖品发放完毕状态
 * 当我们把activity改变成DistriButeOutState，说明抽奖活动结束
 */
public class DistriButeOutState extends State{

    //组合活动类
    private Activity activity;

    public DistriButeOutState(Activity activity){
        this.activity = activity;
    }

    /**
     *奖品发放完毕状态
     */
    @Override
    public void deductMoney() {
        System.out.println("奖品发送完了，请下次再参加~");
    }

    /**
     * 奖品发放完毕状态
     */
    @Override
    public boolean raffle() {
        System.out.println("奖品发送完了，请下次再参加~");
        return false;
    }

    /**
     * 奖品发放完毕状态
     */
    @Override
    public void distribute() {
        System.out.println("奖品发送完了，请下次再参加~");
    }
}
