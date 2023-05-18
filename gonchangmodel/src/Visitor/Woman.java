package Visitor;

/**
 * ClassName:Woman
 * Package:Visitor
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/5/18 - 22:19
 * @Version:v1.0
 */

/**
 * 接待访问者具体类
 */
public class Woman extends Person{
    @Override
    void accept(Action action) {
        action.getWomanResults(this);
    }
}
