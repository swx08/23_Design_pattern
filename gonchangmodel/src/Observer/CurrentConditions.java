package Observer;

/**
 * ClassName:CurrentConditions
 * Package:Observer
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/5/14 - 22:00
 * @Version:v1.0
 */

/**
 * 具体的观察者
 */
public class CurrentConditions implements Observer{
    //温度
    private float temperature;
    //气压
    private float pressure;
    //湿度
    private float altitude;

    @Override
    public void update(float temperature, float pressure, float altitude) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.altitude = altitude;
        disPlay();
    }

    public void disPlay(){
        System.out.println("今天的天气温度为：" + temperature + "********");
        System.out.println("今天的气压为：" + pressure + "********");
        System.out.println("今天的天气湿度为：" + altitude + "********");
    }
}
