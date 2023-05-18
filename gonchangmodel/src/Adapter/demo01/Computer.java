package Adapter.demo01;

/**
 * ClassName:Computer
 * Package:Adapter
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/4/13 - 17:10
 * @Version:v1.0
 */

/**
 * 客户端类：想上网，但是网线接口接不上，需要一个适配器
 */
public class Computer {
    public void network(NetToUsb adapter){
        //上网的方法:具体实现
        adapter.handleRequest();
    }

    public static void main(String[] args) {
        Computer computer = new Computer(); //电脑
        NetToUsb netToUsb = new Adapter(); //转换器
        Adaptee adaptee = new Adaptee(); //网线

        computer.network(netToUsb);
    }
}
