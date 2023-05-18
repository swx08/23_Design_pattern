package Iterator;

/**
 * ClassName:OutPutImpl
 * Package:Iterator
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/5/19 - 0:08
 * @Version:v1.0
 */

import java.util.Iterator;
import java.util.List;

/**
 * 输出实现
 */
public class OutPutImpl {
    private List<College> collegeList;

    public OutPutImpl(List<College> collegeList) {
        this.collegeList = collegeList;
    }

    //打印学院
    public void printCollege(){
        Iterator<College> iterator = collegeList.iterator();
        while (iterator.hasNext()){
            College college = iterator.next();
            System.out.println("========" + college.getName() + "========");
            printDepartment(college.createIterator());
        }
    }

    //打印系
    public void printDepartment(Iterator iterator){
        while (iterator.hasNext()){
            Department department = (Department) iterator.next();
            System.out.println(department.getName());
        }
    }
}
