package Abstract;

/**
 * ClassName:Client
 * Package:Abstract
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/4/11 - 0:46
 * @Version:v1.0
 */

/**
 * 客户消费者类
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("===========小米手机产品=============");
        PhoneProduct xiaoPhone = new XiaomiFactory().createPhoneProduct();
        xiaoPhone.start();
        xiaoPhone.shutdown();
        xiaoPhone.call();
        xiaoPhone.sendSms();

        System.out.println("===========小米路由器产品=============");
        RouterProduct xiaoRouter = new XiaomiFactory().createRouterProduct();
        xiaoRouter.start();
        xiaoRouter.shutdown();
        xiaoRouter.openWifi();
        xiaoRouter.setIng();

        System.out.println("===========华为手机产品=============");
        PhoneProduct huaWeiPhone = new HuaWeiFactory().createPhoneProduct();
        huaWeiPhone.start();
        huaWeiPhone.shutdown();
        huaWeiPhone.call();
        huaWeiPhone.sendSms();
        System.out.println("===========华为路由器产品=============");
        RouterProduct huaWeiRouter = new HuaWeiFactory().createRouterProduct();
        huaWeiRouter.start();
        huaWeiRouter.shutdown();
        huaWeiRouter.openWifi();
        huaWeiRouter.setIng();
    }
}
