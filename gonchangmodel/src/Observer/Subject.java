package Observer;

/**
 * ClassName:Subject
 * Package:Observer
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/5/14 - 21:53
 * @Version:v1.0
 */


/**
 * 操作观察者
 */
public interface Subject {
    //注册观察者
    void registerObserver(Observer observer);
    //删除观察者
    void removeObserver(Observer observer);
    //通知天气更新方法
    void notifyObserver();
}
