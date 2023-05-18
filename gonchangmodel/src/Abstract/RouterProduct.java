package Abstract;

/**
 * ClassName:RouterProduct
 * Package:Abstract
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/4/11 - 0:26
 * @Version:v1.0
 */

/**
 * 路由器产品接口
 */
public interface RouterProduct {
    //开机
    void start();
    //关机
    void shutdown();
    //开wifi
    void openWifi();
    //设置参数
    void setIng();
}
