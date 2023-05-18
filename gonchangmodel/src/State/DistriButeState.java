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
 * 发放奖品状态
 */
public class DistriButeState extends State{

    //组合活动类
    private Activity activity;

    public DistriButeState(Activity activity){
        this.activity = activity;
    }

    /**
     *
     */
    @Override
    public void deductMoney() {
        System.out.println("不能扣除积分");
    }

    /**
     * 当前状态不能抽奖
     */
    @Override
    public boolean raffle() {
        System.out.println("不能抽奖");
        return false;
    }

    /**
     * 当前状态不能发放奖品
     */
    @Override
    public void distribute() {
        if(activity.getCount() > 0){
            System.out.println("恭喜中奖了~");
            activity.setState(activity.getNoRallfeState());
        }else {
            System.out.println("很遗憾，奖品发完了！");
            activity.setState(activity.getDistriButeOutState());
        }
    }
}
