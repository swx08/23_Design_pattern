package Composite;

/**
 * ClassName:OrganziationComponent
 * Package:Composite
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/5/12 - 22:53
 * @Version:v1.0
 */

/**
 * 组合模式
 * 组织机构可以是抽象类或者接口
 */
public abstract class OrganziationComponent {
    //名称
    private String name;
    //描述
    private String description;

    public OrganziationComponent(String name, String description) {
        this.name = name;
        this.description = description;
    }

    //添加方法，叶子结点子类不用实现
    protected void add(OrganziationComponent organziationComponent){
        //默认实现
        throw  new UnsupportedOperationException();
    }

    //删除方法，叶子结点子类不用实现
    protected void remove(OrganziationComponent organziationComponent){
        //默认实现
        throw new UnsupportedOperationException();
    }

    //打印方法,所有子类都需实现
    protected abstract void print();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
