package Builder.demo01;

/**
 * ClassName:Test
 * Package:Builder
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/4/11 - 22:25
 * @Version:v1.0
 */

/**
 * 测试类
 */
public class Test {
    public static void main(String[] args) {
        Director director = new Director();
        Product product = director.buildProduct(new Worker());
        System.out.println(product.toString());
    }
}
