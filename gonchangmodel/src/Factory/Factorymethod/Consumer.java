package Factory.Factorymethod;

/**
 * ClassName:Consumer
 * Package:Factory.simple
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/4/10 - 23:49
 * @Version:v1.0
 */

import Factory.Factorymethod.Car;
import Factory.Factorymethod.WulingFactory;

/**
 * 消费者类
 */
public class Consumer {
    public static void main(String[] args) {
        Car car1 = new WulingFactory().createCar();
        Car car2 = new Factory.Factorymethod.TeslaFactory().createCar();

        car1.name();
        car2.name();
    }
}
