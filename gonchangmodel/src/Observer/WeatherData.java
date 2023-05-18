package Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:WeatherData
 * Package:Observer
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/5/14 - 22:09
 * @Version:v1.0
 */

/**
 * 类是核心
 * 1. 包含最新的天气情况信息
 * 2. 含有 观察者集合，使用ArrayList管理
 * 3. 当数据有更新时，就主动调用ArrayList,通知观察者(接入方)看到最新信息
 *
 */
public class WeatherData implements Subject{
    //温度
    private float temperature;
    //气压
    private float pressure;
    //湿度
    private float altitude;
    //观察者数组
    private List<Observer> observers;

    public WeatherData(){
        observers = new ArrayList<Observer>();
    }

    public void setData(float temperature, float pressure, float altitude){
        this.temperature = temperature;
        this.pressure = pressure;
        this.altitude = altitude;
        changeData();
    }

    //更新数据方法
    public void changeData(){
        notifyObserver();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if(observers.contains(observer)){
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObserver() {
        //遍历观察者，推送更新数据
        for (int i = 0; i < observers.size(); i++){
            observers.get(i).update(this.temperature,this.pressure,this.altitude);
        }
    }
}
