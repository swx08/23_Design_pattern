package Observer;

/**
 * ClassName:Client
 * Package:Observer
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/5/14 - 22:48
 * @Version:v1.0
 */

/**
 *测试类
 */
public class Client {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditions currentConditions = new CurrentConditions();
        weatherData.registerObserver(currentConditions);
        weatherData.setData(23f,45f,12.4f);
        //输出结果
        //今天的天气温度为：23.0********
        //今天的气压为：45.0********
        //今天的天气湿度为：12.4********
    }
}
