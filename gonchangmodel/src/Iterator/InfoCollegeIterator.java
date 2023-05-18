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

import java.util.Iterator;
import java.util.List;

/**
 * 信息工程学院迭代器
 */
public class InfoCollegeIterator implements Iterator {
    //这里我们需要知道Department是以怎样的方式存放的=>集合
    List<Department> departmentList;
    int position = -1; //遍历的位置

    public InfoCollegeIterator(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    //判断是否还有下一个元素
    @Override
    public boolean hasNext() {
        if(position >= departmentList.size() - 1){
            return false;
        }else {
            position++;
            return true;
        }
    }

    //获取下一个元素
    @Override
    public Object next() {
        return departmentList.get(position);
    }

    //删除方法，空实现
    public void remove(){
    }
}
