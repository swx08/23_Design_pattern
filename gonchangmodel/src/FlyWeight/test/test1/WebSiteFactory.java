package FlyWeight.test.test1;

import java.lang.management.PlatformLoggingMXBean;
import java.util.HashMap;
import java.util.Map;

/**
 * ClassName:WebSiteFactory
 * Package:FlyWeight.test.test1
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/5/13 - 13:07
 * @Version:v1.0
 */
public class WebSiteFactory {
    Map<String,WebSite> pools = new HashMap<>();

    public WebSite getWebSite(String type){
        if(!pools.containsKey(type)){
            pools.put(type,new RealWebSite(type));
        }
        return (WebSite) pools.get(type);
    }

    public int WebStieCount(){
        return pools.size();
    }
}
