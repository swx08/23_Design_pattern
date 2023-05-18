package Composite;

/**
 * ClassName:Major
 * Package:Composite
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/5/12 - 23:17
 * @Version:v1.0
 */

/**
 * Major是专业，这是叶子结点，下面不再有分支。
 */
public class Major extends OrganziationComponent{

    public Major(String name, String description) {
        super(name, description);
    }

    //不再重写add和remove方法，因为它是叶子结点。

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    protected void print() {
        System.out.println("==========" + getName() + "==========");
    }
}
