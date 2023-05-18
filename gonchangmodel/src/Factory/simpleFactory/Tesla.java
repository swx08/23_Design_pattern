package Factory.simpleFactory;

/**
 * ClassName:Tesla
 * Package:Factory.simple
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/4/10 - 23:48
 * @Version:v1.0
 */

/**
 * 特斯拉汽车类
 */
public class Tesla implements Car {
    @Override
    public void name() {
        System.out.println("特斯拉");
    }
}
