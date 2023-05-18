package Abstract;

/**
 * ClassName:XiaomiFactory
 * Package:Abstract
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/4/11 - 0:43
 * @Version:v1.0
 */

/**
 * 小米手机工厂类
 */
public class XiaomiFactory implements ProductFactory{
    @Override
    public PhoneProduct createPhoneProduct() {
        return new XiaomiPhone();
    }

    @Override
    public RouterProduct createRouterProduct() {
        return new XiaomiRouter();
    }
}
