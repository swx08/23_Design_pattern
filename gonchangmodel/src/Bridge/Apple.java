package Bridge;

/**
 * ClassName:Lenovo
 * Package:Bridge
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/4/22 - 9:22
 * @Version:v1.0
 */

/**
 * 苹果品牌
 */
public class Apple implements Brand{
    @Override
    public void info() {
        System.out.print("苹果");
    }
}
