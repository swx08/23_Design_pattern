package Proxy.demo1;

/**
 * ClassName:Host
 * Package:Proxy
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/4/22 - 10:06
 * @Version:v1.0
 */

/**
 * 房东
 */
public class Host implements Rent{
    @Override
    public void rent() {
        System.out.println("房东出租房子");
    }
}
