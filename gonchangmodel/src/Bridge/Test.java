package Bridge;

/**
 * ClassName:Test
 * Package:Bridge
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/4/22 - 9:32
 * @Version:v1.0
 */

/**
 * 测试
 */
public class Test {
    public static void main(String[] args) {
        //联想品牌的笔记本电脑
        Computer computer1 = new laptop(new Lenovo());
        computer1.info();
        //苹果品牌的台式机电脑
        Computer computer2 = new desktop(new Apple());
        computer2.info();
        //输出结果:
        //联想笔记本
        //苹果台式机
    }
}
