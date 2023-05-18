package ResponsibilityChan;

/**
 * ClassName:PurchaseRequest
 * Package:ResponsibilityChan
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/5/14 - 23:39
 * @Version:v1.0
 */

/**
 * 请求
 */
public class PurchaseRequest {
    private int type = 0; //请求类型
    private float price = 0.0f; //处理金额
    private int id = 0; //请求id

    public PurchaseRequest(int type, float price, int id) {
        this.type = type;
        this.price = price;
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public float getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }
}
