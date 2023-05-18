package Composite;

/**
 * ClassName:Client
 * Package:Composite
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/5/12 - 23:22
 * @Version:v1.0
 */

/**
 * 测试类
 */
public class Client {
    public static void main(String[] args) {
        //从大到小创建对象  学校
        OrganziationComponent university = new University("清华大学", "中国顶级大学");

        //学院
        OrganziationComponent computerCollege = new College("信息工程学院", "信息工程学院");
        OrganziationComponent maCollege = new College("马克思主义学院", "马克思主义学院");

        //专业
        computerCollege.add(new Major("计算机科学与技术","很不错"));
        computerCollege.add(new Major("软件工程","明年就不招咯"));
        computerCollege.add(new Major("信管","可以"));

        maCollege.add(new Major("马克思主义","难学"));
        maCollege.add(new Major("毛概","不错"));

        //将学院加入到学校中去
        university.add(computerCollege);
        university.add(maCollege);

        //打印学校、学院、专业
        //university.print();
        //输出结果
        // ---------------清华大学-----------------
        //---------------信息工程学院-----------------
        //==========计算机科学与技术==========
        //==========软件工程==========
        //==========信管==========
        //---------------马克思主义学院-----------------
        //==========马克思主义==========
        //==========毛概==========
        computerCollege.print();
        //输出结果
        // ---------------信息工程学院-----------------
        //==========计算机科学与技术==========
        //==========软件工程==========
        //==========信管==========
    }
}
