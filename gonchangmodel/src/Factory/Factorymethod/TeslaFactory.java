package Factory.Factorymethod;

/**
 * ClassName:TeslaFactory
 * Package:Factory.method
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/4/10 - 23:58
 * @Version:v1.0
 */

/**
 * 特斯拉汽车工厂类
 */
public class TeslaFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new Tesla();
    }
}
