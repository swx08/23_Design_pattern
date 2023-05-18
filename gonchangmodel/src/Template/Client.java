package Template;

/**
 * ClassName:Client
 * Package:Template
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/5/18 - 20:11
 * @Version:v1.0
 */

/**
 * 测试类
 */
public class Client {
    public static void main(String[] args) {
        //制作红豆浆
        System.out.println("----------制作红豆浆-------------");
        RedBeanSoyaMilk redBeanSoyaMilk = new RedBeanSoyaMilk();
        redBeanSoyaMilk.make();

        //制作红豆浆
        System.out.println("------------制作黑豆浆--------------");
        BlankBeanSoyaMilk blankBeanSoyaMilk = new BlankBeanSoyaMilk();
        blankBeanSoyaMilk.make();

        //制作纯豆浆
        System.out.println("------------制作纯豆浆--------------");
        SimpleBeanSoyaMilk simpleBeanSoyaMilk = new SimpleBeanSoyaMilk();
        simpleBeanSoyaMilk.make();
    }
}
