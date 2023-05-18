package Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * ClassName:ComputerCollege
 * Package:Iterator
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/5/18 - 23:52
 * @Version:v1.0
 */

/**
 * 信息工程学院
 */
public class InfoCollege implements College{
    //添加系
    List<Department> departmentList;

    public InfoCollege() {
        departmentList = new ArrayList<Department>();
        addDepartment("信息安全", "信息安全");
        addDepartment("网络安全", "网络安全");
        addDepartment("服务器安全", "服务器安全");
    }

    @Override
    public String getName() {
        return "信息工程学院";
    }

    //添加系
    @Override
    public void addDepartment(String name, String description) {
        Department department = new Department(name, description);
        departmentList.add(department);
    }

    //迭代器遍历操作
    @Override
    public Iterator createIterator() {
        return new InfoCollegeIterator(departmentList);
    }
}
