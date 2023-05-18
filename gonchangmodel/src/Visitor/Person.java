package Visitor;

/**
 * ClassName:Pserson
 * Package:Visitor
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/5/18 - 22:19
 * @Version:v1.0
 */

/**
 * 接待访问者抽象类
 */
public abstract class Person {
    abstract void accept(Action action);
}
