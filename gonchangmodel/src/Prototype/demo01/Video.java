package Prototype.demo01;

/**
 * ClassName:Video
 * Package:Prototype
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/4/12 - 23:57
 * @Version:v1.0
 */

import java.util.Date;

/**
 * 视频类
 * 1、实现一个接口：cloneable
 * 2、重写clone方法
 */
public class Video implements Cloneable{
    private String name;
    private Date date;

    public Video() {
    }

    public Video(String name, Date date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Video{" +
                "name='" + name + '\'' +
                ", date=" + date +
                '}';
    }
}
