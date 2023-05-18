package FlyWeight;

/**
 * ClassName:WebSiteFactory
 * Package:FlyWeight
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/5/13 - 10:18
 * @Version:v1.0
 */

import java.util.HashMap;
import java.util.Map;

/**
 * 享元模式
 * 生成网站的工厂，充当一个池的作用，根据需求返回具体的网站
 */
public class WebSiteFactory {
    //集合，充当池的作用
    Map<String,ConcrrentWebSite> pools = new HashMap<>();

    //根据网站的类型，返回一个网站，如果没有就创建一个网站，并放到池中，并返回。
    public WebSite getWebSite(String type){
        //如果没有就创建一个网站，并放到池中
        if(!pools.containsKey(type)){
            pools.put(type,new ConcrrentWebSite(type));
        }
        return (WebSite) pools.get(type);
    }

    //获取网站分类的总数(池中有几个)
    public int WebSiteCount(){
        return pools.size();
    }
}
