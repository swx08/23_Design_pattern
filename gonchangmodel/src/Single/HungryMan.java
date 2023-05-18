package Single;

/**
 * ClassName:HungryMan
 * Package:Single
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/4/11 - 13:30
 * @Version:v1.0
 */

/**
 * 饿汉式(本身就是线程安全的)
 */
public class HungryMan {
    //私有化构造器
    private HungryMan(){};
    //因为是饿汉式，所以一上来就new了实例对象
    private static HungryMan instance = new HungryMan();

    public static HungryMan getInstance(){
        return instance;
    }

    //测试方法
    public void test(){
        System.out.println("饿汉式(本身就是线程安全的)");
    }

    //测试
    public static void main(String[] args) {
        HungryMan instance1 = HungryMan.getInstance();
        instance1.test();
    }
}
