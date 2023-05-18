package Builder.demo02;

/**
 * ClassName:Test
 * Package:Builder.demo02
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/4/11 - 23:10
 * @Version:v1.0
 */

/**
 * 测试类
 */
public class Test {
    public static void main(String[] args) {
        Client client = new Client();
//        Product product = client.getProduct();
        Product product = client.buildA("全家桶").buildB("鸡翅").buildC("鸭脖").buildD("鸡腿").getProduct();
        System.out.println(product.toString());
    }
}
