package Visitor;

/**
 * ClassName:Action
 * Package:Visitor
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/5/18 - 22:14
 * @Version:v1.0
 */

/**
 * 评价抽象类
 */
public abstract class Action {
    //得到男性的测评
    abstract void getManResults(Man man);

    //得到女性的测评
    abstract void getWomanResults(Woman woman);
}
