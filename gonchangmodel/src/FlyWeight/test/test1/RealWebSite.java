package FlyWeight.test.test1;

import javax.management.relation.Relation;

/**
 * ClassName:RealWebSite
 * Package:FlyWeight.test.test1
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/5/13 - 13:03
 * @Version:v1.0
 */
public class RealWebSite extends WebSite{

    private String type;
    public RealWebSite(String type){
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("网站类型为：" + type + "。" + user.getName() +  "在使用中...");
    }
}
