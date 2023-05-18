package Visitor;

/**
 * ClassName:Success
 * Package:Visitor
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/5/18 - 22:24
 * @Version:v1.0
 */

/**
 * 具体评价类：评价成功
 */
public class Success extends Action{
    @Override
    void getManResults(Man man) {
        System.out.println("男人给该歌手的评价是：很成功！");
    }

    @Override
    void getWomanResults(Woman woman) {
        System.out.println("女人给该歌手的评价是：很成功！");
    }
}
