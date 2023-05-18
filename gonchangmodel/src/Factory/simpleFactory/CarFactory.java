package Factory.simpleFactory;

/**
 * ClassName:CarFactoey
 * Package:Factory.simple
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/4/10 - 23:50
 * @Version:v1.0
 */


/**
 * 汽车工厂类
 */
public class CarFactory {
    public static Car createCar(String car){
        if(car.equals("五菱宏光")){
            return new Wuling();
        }else if(car.equals("特斯拉")){
            return new Tesla();
        }else {
            return null;
        }
    }
}
