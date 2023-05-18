package Iterator;

/**
 * ClassName:Client
 * Package:Iterator
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/5/19 - 0:18
 * @Version:v1.0
 */

import java.util.ArrayList;
import java.util.List;

/**
 * 测试类
 */
public class Client {
    public static void main(String[] args) {
        //创建学院集合
        List<College> collegeList = new ArrayList<>();

        //创建学院
        ComputerCollege computerCollege = new ComputerCollege();
        InfoCollege infoCollege = new InfoCollege();

        //添加学院
        collegeList.add(computerCollege);
        collegeList.add(infoCollege);

        //输出
        OutPutImpl outPut = new OutPutImpl(collegeList);
        outPut.printCollege();

        //========计算机学院========
        //java专业
        //php专业
        //大数据专业
        //========信息工程学院========
        //信息安全
        //网络安全
        //服务器安全
    }
}
