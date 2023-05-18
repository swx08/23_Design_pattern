package Single;

/**
 * ClassName:InnerSingle
 * Package:Single
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/4/11 - 13:52
 * @Version:v1.0
 */

/**
 * 登记式/静态内部类(饿汉式)
 */
public class InnerSingle {
    //在内部类里面实例化对象
    private static class SingleHandler{
        private static final InnerSingle INSTANCE = new InnerSingle();
    }
    //私有化构造器
    private InnerSingle(){}

    public static InnerSingle getInstance(){
        return SingleHandler.INSTANCE;
    }

    //测试方法
    public void test(){
        System.out.println("登记式/静态内部类(饿汉式)");
    }

    //测试
    public static void main(String[] args) {
        InnerSingle instance = InnerSingle.getInstance();
        instance.test();
    }
}
