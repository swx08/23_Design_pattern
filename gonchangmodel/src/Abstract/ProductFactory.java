package Abstract;

/**
 * ClassName:ProductFactory
 * Package:Abstract
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/4/11 - 0:38
 * @Version:v1.0
 */

/**
 * 抽象产品工厂类
 */
public interface ProductFactory {
    //生产手机产品
    PhoneProduct createPhoneProduct();

    //生产路由器产品
    RouterProduct createRouterProduct();
}
