package Single;

/**
 * ClassName:lazy2
 * Package:Single
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/4/11 - 13:24
 * @Version:v1.0
 */

/**
 * 懒汉式，线程安全
 */
public class lazy2 {
    //私有化构造器
    private lazy2(){};

    private static lazy2 instance;

    //同步方法加锁
    public static synchronized lazy2 getInstance(){
        if(instance == null){
            instance = new lazy2();
        }
        return instance;
    }
    //测试方法
    public void test(){
        System.out.println("懒汉式，线程安全");
    }
    //测试
    public static void main(String[] args) {
        lazy2 instance1 = lazy2.getInstance();
        instance1.test();
    }
}
