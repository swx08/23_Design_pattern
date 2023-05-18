package Single.Exerce;

/**
 * ClassName:demo
 * Package:Single.Exerce
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/4/20 - 15:08
 * @Version:v1.0
 */
public class HelloWorld {
    public static void main(String []args) {
        hman single1 =  hman.getInstance();
        hman single2 =  hman.getInstance();

        System.out.println(single1 == single2);
        single1.test();
    }
}

class hman{

    private hman(){}

    private static hman single = new hman();

    public static hman getInstance(){
        return single;
    }
    public void test(){
        System.out.println("测试");
    }
}
