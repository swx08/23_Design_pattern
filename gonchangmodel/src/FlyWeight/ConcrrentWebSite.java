package FlyWeight;

/**
 * ClassName:ConcrrentWebSite
 * Package:FlyWeight
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/5/13 - 10:16
 * @Version:v1.0
 */

/**
 * 具体的网站
 */
public class ConcrrentWebSite extends WebSite{

    //网站类型
    //共享部分，这是内部状态
    private String type = "";

    public ConcrrentWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("网站的发布类型为：" + type + "。"+ user.getName() + "在使用中...");
    }
}
