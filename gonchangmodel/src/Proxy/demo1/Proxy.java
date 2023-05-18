package Proxy.demo1;

/**
 * ClassName:Proxy
 * Package:Proxy
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/4/22 - 10:07
 * @Version:v1.0
 */

/**
 * 代理角色(中介)
 */
public class Proxy implements Rent{
    //组合房东
    private Host host;

    public Proxy(){

    }

    public Proxy(Host host){
        this.host = host;
    }

    @Override
    public void rent() {
        //代理房东出租房子
        host.rent();
        //额外干其他事情
        seeHouse();
        heTong();
    }

    //中介可以额外干其他事情
    public void seeHouse(){
        System.out.println("中介带你看房子");
    }

    public void heTong(){
        System.out.println("签租赁合同");
    }
}
