package Proxy.demo1;

/**
 * ClassName:Client
 * Package:Proxy
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/4/22 - 10:09
 * @Version:v1.0
 */
/**
 * 客户、租房子的人
 */
public class Client {
    public static void main(String[] args) {
        //方式1、直接找房东租房子
        Host host = new Host();
        //host.rent();
        //方式2、通过中介租房子,但是呢，代理角色一般会有其他附属操作。
        Proxy proxy = new Proxy(host);
        //你不用面对房东，直接找中介租房即可。
        proxy.rent();
        //输出结果：
        //房东出租房子
        //中介带你看房子
        //签租赁合同
    }
}
