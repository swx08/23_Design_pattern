package Template;

/**
 * ClassName:SimpleSoyaMilk
 * Package:Template
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/5/18 - 21:38
 * @Version:v1.0
 */

/**
 * 纯豆浆类
 */
public class SimpleBeanSoyaMilk extends SoyaMilk{
    @Override
    void addCondiments() {
        //空实现
    }

    //返回false不添加任何配料
    @Override
    boolean CustomWantConditions() {
        return false;
    }
}
