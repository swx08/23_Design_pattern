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

import java.util.Random;

/**
 * 可以抽奖状态
 */
public class CanRallfeState extends State{

    //组合活动类
    private Activity activity;

    public CanRallfeState(Activity activity){
        this.activity = activity;
    }

    /**
     * 已经扣取过积分了,不能再扣了
     */
    @Override
    public void deductMoney() {
        System.out.println("已经扣取过积分了~");
    }

    /**
     * 可以抽奖状态
     */
    @Override
    public boolean raffle() {
        System.out.println("请稍后，正在抽奖！");
        Random random = new Random();
        int num = random.nextInt(10);
        //10%中奖机会
        if(num == 0){
            //改变活动状态为发放奖品
            activity.setState(activity.getDistriButeState());
            return true;
        }else {
            System.out.println("很遗憾，没有抽中");
            //将状态修改为不能抽奖状态
            activity.setState(activity.getNoRallfeState());
            return false;
        }
    }

    /**
     * 当前状态不能发放奖品
     */
    @Override
    public void distribute() {
        System.out.println("没中奖，不能发放奖品~");
    }
}
