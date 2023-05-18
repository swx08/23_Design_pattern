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
 * 不能抽奖状态
 */
public class NoRallfeState extends State{

    //组合活动类
    private Activity activity;

    public NoRallfeState(Activity activity){
        this.activity = activity;
    }

    /**
     * 当我状态是不可以抽奖状态，扣除积分后，将状态设置为可以抽奖状态
     */
    @Override
    public void deductMoney() {
        System.out.println("扣除积分成功，你可以抽奖了");
        activity.setState(activity.getCanRallfeState());
    }

    /**
     * 当前状态不能抽奖
     */
    @Override
    public boolean raffle() {
        System.out.println("扣了积分才可以抽奖哦！");
        return false;
    }

    /**
     * 当前状态不能发放奖品
     */
    @Override
    public void distribute() {
        System.out.println("不能发放奖品~");
    }
}
