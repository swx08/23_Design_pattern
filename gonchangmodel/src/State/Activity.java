package State;

/**
 * ClassName:Activity
 * Package:State
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/5/15 - 23:00
 * @Version:v1.0
 */

/**
 * 活动类
 */
public class Activity {
    //表示当前活动的状态
    State state = null;

    //奖品数量
    int count = 0;

    //四种状态
    State noRallfeState = new NoRallfeState(this);
    State canRallfeState = new CanRallfeState(this);
    State distriButeState = new DistriButeState(this);
    State distriButeOutState = new DistriButeOutState(this);

    //初始化当前状态和奖品数量
    public Activity(int count){
        this.state = getNoRallfeState();
        this.count = count;
    }

    //扣除积分
    public void deductMoney(){
        state.deductMoney();
    }

    public void raffle(){
        //如果抽奖成功
        if(state.raffle()){
            //则去领取奖品
            state.distribute();
        }
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getCount() {
        int curCount = count;
        count--;
        return curCount;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public State getNoRallfeState() {
        return noRallfeState;
    }

    public void setNoRallfeState(State noRallfeState) {
        this.noRallfeState = noRallfeState;
    }

    public State getCanRallfeState() {
        return canRallfeState;
    }

    public void setCanRallfeState(State canRallfeState) {
        this.canRallfeState = canRallfeState;
    }

    public State getDistriButeState() {
        return distriButeState;
    }

    public void setDistriButeState(State distriButeState) {
        this.distriButeState = distriButeState;
    }

    public State getDistriButeOutState() {
        return distriButeOutState;
    }

    public void setDistriButeOutState(State distriButeOutState) {
        this.distriButeOutState = distriButeOutState;
    }
}
