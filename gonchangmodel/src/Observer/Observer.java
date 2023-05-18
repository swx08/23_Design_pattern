package Observer;

/**
 * ClassName:Observer
 * Package:Observer
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/5/14 - 21:55
 * @Version:v1.0
 */

/**
 * 观察者接口，由具体观察者实现
 */
public interface Observer {
    //天气更新方法
    void update(float temperature,float pressure,float altitude);
}
