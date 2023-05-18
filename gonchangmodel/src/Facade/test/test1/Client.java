package Facade.test.test1;

/**
 * ClassName:Client
 * Package:Facade.test.test1
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/5/13 - 13:34
 * @Version:v1.0
 */
public class Client {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.on();
        System.out.println("-----------------------");
        facade.play();
        System.out.println("------------------------");
        facade.pause();
        System.out.println("------------------------");
        facade.end();
    }
}
