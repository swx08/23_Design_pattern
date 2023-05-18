package Abstract;

/**
 * ClassName:PhoneProduct
 * Package:Abstract
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/4/11 - 0:24
 * @Version:v1.0
 */

/**
 * 手机产品接口
 */
public interface PhoneProduct {
    //开机
    void start();
    //关机
    void shutdown();
    //打电话
    void call();
    //发消息
    void sendSms();
}
