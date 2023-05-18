package Prototype.demo01;

/**
 * ClassName:Clone
 * Package:Prototype
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/4/13 - 0:00
 * @Version:v1.0
 */

import java.util.Date;

/**
 * 客户端克隆
 */
public class Clone {
    public static void main(String[] args) throws CloneNotSupportedException {
        //原型对象
        Date date = new Date();
        Video v1 = new Video("sixkey learning java", date);
        //浅克隆
        //以前如果我们需要其他的Video对象v2
        //Video v2 = new Video("sixkey learning java", date);
        //现在，我们通过clone方式克隆出一个新对象
        Video v2 = (Video) v1.clone();//克隆出来的对象和原来是一模一样的

        //输出结果是一样的
        System.out.println(v1 + "    " + "v1.hashCode->" + v1.hashCode());
        System.out.println(v2 + "    " + "v2.hashCode->" + v2.hashCode());
        System.out.println("============================");
        //但是当我们修改了Date的值，V1的Date值和V2的Date值还是一样
        //说明V2的Date值是指向了V1的Date值的。
        date.setDate(12345645);
        System.out.println(v1 + "    " + "v1.hashCode->" + v1.hashCode());
        System.out.println(v2 + "    " + "v2.hashCode->" + v2.hashCode());
    }
}
