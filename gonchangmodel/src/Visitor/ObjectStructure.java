package Visitor;

/**
 * ClassName:ObjectStructure
 * Package:Visitor
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/5/18 - 22:31
 * @Version:v1.0
 */

import java.util.ArrayList;
import java.util.List;

/**
 * 数据机构，维护很多人
 */
public class ObjectStructure {
    private List<Person> personList = new ArrayList<>();

    //添加
    public void attach(Person person){
        personList.add(person);
    }

    //移除
    public void detach(Person person){
        personList.remove(person);
    }

    //展示评价
    public void disPlay(Action action){
        for (Person person : personList) {
            person.accept(action);
        }
    }
}
