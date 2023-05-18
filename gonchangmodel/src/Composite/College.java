package Composite;

/**
 * ClassName:University
 * Package:Composite
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/5/12 - 23:03
 * @Version:v1.0
 */

import java.util.ArrayList;
import java.util.List;

/**
 * College是学院，这是管理者,可以管理专业major
 */
public class College extends OrganziationComponent{
    //组合模式核心：聚合OrganziationComponent
    List<OrganziationComponent> organziationComponents = new ArrayList<>();

    public College(String name, String description){
        super(name,description);
    }

    //重写add方法
    @Override
    protected void add(OrganziationComponent organziationComponent) {
        //将来业务中，College 和 University的add方法不一定完全一样。
        organziationComponents.add(organziationComponent);
    }

    //重写remove方法
    @Override
    protected void remove(OrganziationComponent organziationComponent) {
        organziationComponents.remove(organziationComponent);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    //打印出当前学校的名称以及学校下的学院名称
    @Override
    protected void print() {
        //打印学校名称
        System.out.println("---------------" +getName() + "-----------------");
        //打印学院名称
        for (OrganziationComponent organziationComponent : organziationComponents) {
            organziationComponent.print();
        }
    }
}
