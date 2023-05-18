package FlyWeight.test.test1;

/**
 * ClassName:Client
 * Package:FlyWeight.test.test1
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/5/13 - 13:15
 * @Version:v1.0
 */
public class Client {
    public static void main(String[] args) {
        WebSiteFactory factory = new WebSiteFactory();
        WebSite webSite = factory.getWebSite("新闻");
        webSite.use(new User("swx"));
        WebSite webSite1 = factory.getWebSite("博客");
        webSite1.use(new User("jack"));
        WebSite webSite2 = factory.getWebSite("博客");
        webSite2.use(new User("tom"));

        System.out.println(factory.WebStieCount());
    }
}
