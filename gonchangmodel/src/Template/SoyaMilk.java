package Template;

/**
 * ClassName:SoyaMilk
 * Package:Template
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/5/18 - 20:02
 * @Version:v1.0
 */

/**
 * 抽象类：表示豆浆
 */
public abstract class SoyaMilk {

    //模板方法，用final修饰，防止子类覆盖
    final void make(){
        select();
        //如果为true则顾客加配料
        if (CustomWantConditions()){
            addCondiments();
        }
        soak();
        beat();
    }

    //选材料
    void select(){
        System.out.println("选择上好的黄豆");
    }

    //添加配料，由子类具体实现
    abstract void addCondiments();

    //浸泡
    void soak(){
        System.out.println("第三步，黄豆和配料开始浸泡，需要3小时");
    }

    //放到豆浆机中
    void beat(){
        System.out.println("第四步，黄豆和配料放到豆浆机中去打碎");
    }

    //钩子方法，顾客是否相加配料
    boolean CustomWantConditions(){
        return true;
    }
}
