package Single;

/**
 * ClassName:EnumSingle
 * Package:Single
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/4/11 - 13:57
 * @Version:v1.0
 */

/**
 * 枚举
 */
public enum EnumSingle {
    INSTANCE;
    //测试方法
    public void test(){
        System.out.println("枚举");
    }
    //测试
    public static void main(String[] args) {
        EnumSingle instance = EnumSingle.INSTANCE;
        instance.test();
    }
}
