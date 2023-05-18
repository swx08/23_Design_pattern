package ResponsibilityChan;

/**
 * ClassName:DepartMentApprover
 * Package:ResponsibilityChan
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/5/14 - 23:52
 * @Version:v1.0
 */

/**
 * 具体处理请求审批类之一：校长
 */
public class SchoolMasterApprover extends Approver{

    public SchoolMasterApprover(String name) {
        super(name);
    }

    @Override
    public void process(PurchaseRequest purchaseRequest) {
        //如果自己可以处理则自己处理
        if(purchaseRequest.getPrice() > 30000){
            System.out.println("请求编号为：" + purchaseRequest.getId() + "的请求被" + name + "处理了");
        }else {
            //不能则交给下个审批人处理
            approver.process(purchaseRequest);
        }
    }
}
