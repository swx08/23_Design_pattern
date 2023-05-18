package ResponsibilityChan;

/**
 * ClassName:Client
 * Package:ResponsibilityChan
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/5/15 - 0:05
 * @Version:v1.0
 */

/**
 * 测试类
 */
public class Client {
    public static void main(String[] args) {
        //创建请求
        PurchaseRequest purchaseRequest = new PurchaseRequest(1,1200,1);

        //创建相应的审批人
        DepartMateApprover departMateApprover = new DepartMateApprover("张主任");
        CollegeApprover collegeApprover = new CollegeApprover("李院长");
        ViceSchoolMasterApprover viceSchoolMasterApprover = new ViceSchoolMasterApprover("普副校长");
        SchoolMasterApprover schoolMasterApprover = new SchoolMasterApprover("石校长");

        //需要将各个审批级别的审批人设置好(处理人构成环状)
        departMateApprover.setApprover(collegeApprover);
        collegeApprover.setApprover(viceSchoolMasterApprover);
        viceSchoolMasterApprover.setApprover(schoolMasterApprover);
        schoolMasterApprover.setApprover(departMateApprover);

        //测试,从级别低的开始审批
        departMateApprover.process(purchaseRequest);

        //输出结果
        //请求编号为：1的请求被张主任处理了
    }
}
