package Factory.Factorymethod;

/**
 * ClassName:WulingFactory
 * Package:Factory.method
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/4/10 - 23:57
 * @Version:v1.0
 */

/**
 * 五菱宏光汽车工厂类
 */
public class WulingFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new Wuling();
    }
}
