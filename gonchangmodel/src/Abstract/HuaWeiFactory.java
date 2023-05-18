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
 * 华为手机工厂类
 */
public class HuaWeiFactory implements ProductFactory{
    @Override
    public PhoneProduct createPhoneProduct() {
        return new HuaWeiPhone();
    }

    @Override
    public RouterProduct createRouterProduct() {
        return new HuaWeiRouter();
    }
}
