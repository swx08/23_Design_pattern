package Single;

/**
 * ClassName:DCLSingle
 * Package:Single
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/4/11 - 13:45
 * @Version:v1.0
 */

/**
 * 双检锁/双重校验锁
 */
public class DCLSingle {
    //私有化构造器
    private DCLSingle(){};
    //第一次加锁：使用volatile关键字
    private static volatile DCLSingle instance;

    public static DCLSingle getInstance(){
        if(instance == null){
            //第二次加锁：同步代码块加锁
            synchronized (DCLSingle.class){
                if(instance == null){
                    instance = new DCLSingle();
                }
            }
        }
        return instance;
    }

    //测试方法
    public void test(){
        System.out.println("双检锁/双重校验锁");
    }

    //测试
    public static void main(String[] args) {
        DCLSingle instance1 = DCLSingle.getInstance();
        instance1.test();
    }
}
