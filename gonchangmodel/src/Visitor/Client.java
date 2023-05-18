package Visitor;

/**
 * ClassName:Client
 * Package:Visitor
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/5/18 - 22:36
 * @Version:v1.0
 */

/**
 * 测试类
 */
public class Client {
    public static void main(String[] args) {
        //创建ObjectStructure
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.attach(new Man());
        objectStructure.attach(new Woman());

        //评价成功
        Success success = new Success();
        objectStructure.disPlay(success);

        //评价失败
        Fail fail = new Fail();
        objectStructure.disPlay(fail);

        //输出结果
        //男人给该歌手的评价是：很成功！
        //女人给该歌手的评价是：很成功！
        //男人给该歌手的评价是：晋级失败！
        //女人给该歌手的评价是：晋级失败！
    }
}
