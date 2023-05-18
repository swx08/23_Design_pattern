package Abstract;

/**
 * ClassName:XiaomiPhone
 * Package:Abstract
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/4/11 - 0:29
 * @Version:v1.0
 */

/**
 * 华为手机产品
 */
public class HuaWeiPhone implements PhoneProduct{
    @Override
    public void start() {
        System.out.println("华为手机开机");
    }

    @Override
    public void shutdown() {
        System.out.println("华为手机关机");
    }

    @Override
    public void call() {
        System.out.println("华为手机打电话");
    }

    @Override
    public void sendSms() {
        System.out.println("华为手机发消息");
    }
}
