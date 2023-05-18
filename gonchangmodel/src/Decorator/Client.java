package Decorator;

/**
 * ClassName:Client
 * Package:Decorator
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/5/12 - 16:58
 * @Version:v1.0
 */
/**
 * 下单者：客户
 */
public class Client {
    public static void main(String[] args) {
        //装饰者模式下的订单：2份巧克力 + 1份牛奶的美式咖啡。
        Drink longBlack = new LongBlack();
        System.out.println("单品美式咖啡费用：" + longBlack.cost());

        //加入一份牛奶
        longBlack = new Milk(longBlack);
        System.out.println("加入一份牛奶后的美式咖啡费用：" + longBlack.cost());

        //加入1份巧克力
        longBlack = new Chocolate(longBlack);
        System.out.println("加入1份巧克力和一份牛奶后的美式咖啡费用：" + longBlack.cost());

        //中式咖啡加豆浆再加牛奶
        Drink descf = new Descf();

        //加入一份豆浆
        descf = new Soy(descf);

        //加入一份牛奶
        descf = new Milk(descf);

        System.out.println("加入一份豆浆、一份牛奶的中式咖啡价格为：" + descf.cost());
    }
}
