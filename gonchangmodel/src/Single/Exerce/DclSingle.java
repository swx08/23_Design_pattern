package Single.Exerce;

import Single.DCLSingle;

/**
 * ClassName:DclSingle
 * Package:Single.Exerce
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/4/15 - 17:48
 * @Version:v1.0
 */
public class DclSingle {
    private DclSingle(){}

    private static volatile DclSingle dclSingle;

    public static DclSingle getInstance(){
        if(dclSingle == null){
            synchronized (DclSingle.class){
                if(dclSingle == null){
                    dclSingle = new DclSingle();
                }
            }
        }
        return dclSingle;
    }

    public void test(){
        System.out.println("双重检锁");
    }

    public static void main(String[] args) {
        DclSingle dclSingle1 = new DclSingle();
        dclSingle1.test();

        DclSingle dclSingle2 = new DclSingle();
        System.out.println(dclSingle1 == dclSingle2);
    }
}
