package Abstract;

/**
 * ClassName:XiaomiRouter
 * Package:Abstract
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/4/11 - 0:32
 * @Version:v1.0
 */

/**
 * 小米路由器产品
 */
public class XiaomiRouter implements RouterProduct{
    @Override
    public void start() {
        System.out.println("小米路由器开机");
    }

    @Override
    public void shutdown() {
        System.out.println("小米路由器关机");
    }

    @Override
    public void openWifi() {
        System.out.println("打开小米路由器");
    }

    @Override
    public void setIng() {
        System.out.println("设置小米路由器参数");
    }
}
