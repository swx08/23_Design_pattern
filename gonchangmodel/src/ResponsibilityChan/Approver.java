package ResponsibilityChan;

/**
 * ClassName:Approver
 * Package:ResponsibilityChan
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/5/14 - 23:42
 * @Version:v1.0
 */

/**
 * 请求处理类
 */
public abstract class Approver {
    //下一个处理类
    Approver approver;
    //名称
    String name;

    public Approver(String name) {
        this.name = name;
    }

    //下一个处理者
    public void setApprover(Approver approver){
        this.approver = approver;
    }

    //处理审批请求的方法，得到一个请求，处理由子类完成，此方法设计成抽象
    public abstract void process(PurchaseRequest purchaseRequest);
}
