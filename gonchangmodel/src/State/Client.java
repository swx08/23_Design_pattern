package State;

/**
 * ClassName:Client
 * Package:State
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/5/15 - 23:49
 * @Version:v1.0
 */

/**
 * 测试类
 */
public class Client {
    public static void main(String[] args) {
        //创建活动对象，奖品设置1个
        Activity activity = new Activity(1);

        //连续抽奖
        for(int i = 0; i < 30; i++){
            System.out.println("第--------" + (i+1) + "次抽奖--------");
            //扣积分
            activity.deductMoney();

            //开始抽奖
            activity.raffle();
        }
    }
}
