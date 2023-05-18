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
 * 联想品牌
 */
public class Lenovo implements Brand{
    @Override
    public void info() {
        System.out.print("联想");
    }
}
