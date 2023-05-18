package Bridge;

/**
 * ClassName:Computer
 * Package:Bridge
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/4/22 - 9:25
 * @Version:v1.0
 */

/**
 * 电脑抽象类
 */
public abstract class Computer {
    //组合品牌---桥接的最好体现。
    protected Brand brand;

    public Computer(Brand brand){
        this.brand = brand;
    }

    public void info(){
        //电脑自带品牌
        brand.info();
    }
}

//桌面电脑
class desktop extends Computer{

    public desktop(Brand brand) {
        super(brand);
    }

    @Override
    public void info() {
        super.info();
        System.out.println("台式机");
    }
}

//笔记本
class laptop extends Computer{

    public laptop(Brand brand) {
        super(brand);
    }

    @Override
    public void info() {
        super.info();
        System.out.println("笔记本");
    }
}
