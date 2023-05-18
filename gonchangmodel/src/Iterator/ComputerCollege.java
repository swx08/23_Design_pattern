package Iterator;

import java.util.Iterator;

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
 * 计算机学院
 */
public class ComputerCollege implements College{
    //添加系
    Department[] departments;
    int departmentNum = 0; //系的个数

    public ComputerCollege() {
        departments = new Department[5];
        addDepartment("java专业", "java专业");
        addDepartment("php专业", "php专业");
        addDepartment("大数据专业", "大数据专业");
    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    //添加系
    @Override
    public void addDepartment(String name, String description) {
        Department department = new Department(name, description);
        departments[departmentNum++] = department;
    }

    //迭代器遍历操作
    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
