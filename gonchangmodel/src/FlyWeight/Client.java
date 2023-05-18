package FlyWeight;

/**
 * ClassName:Client
 * Package:FlyWeight
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/5/13 - 10:26
 * @Version:v1.0
 */

/**
 * 测试
 */
public class Client {
    public static void main(String[] args) {
        //创建网站工厂
        WebSiteFactory factory = new WebSiteFactory();
        //以新闻类型发布网站
        WebSite webSite = factory.getWebSite("新闻");
        webSite.use(new User("tom"));
        //以博客类型发布网站
        WebSite webSite1 = factory.getWebSite("博客");
        webSite1.use(new User("smith"));
        //以博客类型发布网站
        WebSite webSite2 = factory.getWebSite("博客");
        webSite2.use(new User("jack"));
        //以博客类型发布网站
        WebSite webSite3 = factory.getWebSite("博客");
        webSite3.use(new User("king"));
        //以博客类型发布网站
        WebSite webSite4 = factory.getWebSite("博客");
        webSite4.use(new User("swx"));
        //返回网站分类个数
        System.out.println("网站的分类共：" + factory.WebSiteCount() + "种");

        //输出结果网站的发布类型为：新闻。tom在使用中...
        //网站的发布类型为：博客。smith在使用中...
        //网站的发布类型为：博客。jack在使用中...
        //网站的发布类型为：博客。king在使用中...
        //网站的发布类型为：博客。swx在使用中...
        //网站的分类共：2种
    }
}
