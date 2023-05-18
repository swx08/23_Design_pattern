package Iterator;

/**
 * ClassName:College
 * Package:Iterator
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/5/18 - 23:46
 * @Version:v1.0
 */

import java.util.Iterator;

/**
 * 接口
 */
public interface College {
    String getName();

    //添加系
    void addDepartment(String name, String description);

    //提供一个迭代器，用于遍历
    Iterator createIterator();
}
