package Single;

/**
 * ClassName:lazy1
 * Package:Single
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/4/11 - 13:18
 * @Version:v1.0
 */

/**
 * 懒汉式，线程不安全
 */
public class lazy1 {
    //私有化构造器
    private lazy1(){}
    private static lazy1 instance;

    public static lazy1 getInstance(){
        if(instance == null){
            instance = new lazy1();
        }
        return instance;
    }
    //测试方法
    public void test(){
        System.out.println("懒汉式，线程不安全");
    }
    //测试
    public static void main(String[] args) {
        lazy1 instance1 = lazy1.getInstance();
        instance1.test();
    }
}
