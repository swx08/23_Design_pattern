package Iterator;

/**
 * ClassName:ComputerCollegeIterator
 * Package:Iterator
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/5/18 - 23:21
 * @Version:v1.0
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 计算机科学学院迭代器
 */
public class ComputerCollegeIterator implements Iterator {
    //这里我们需要知道Department是以怎样的方式存放的=>数组
    Department[] departments;
    int position = 0; //遍历的位置

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    //判断是否还有下一个元素
    @Override
    public boolean hasNext() {
        if(position > departments.length || departments[position] == null){
            return false;
        }else {
            return true;
        }
    }

    //获取下一个元素
    @Override
    public Object next() {
        Department department = departments[position];
        position++;
        return department;
    }

    //删除方法，空实现
    public void remove(){
    }
}
