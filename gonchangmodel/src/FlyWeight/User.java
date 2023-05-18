package FlyWeight;

/**
 * ClassName:User
 * Package:FlyWeight
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/5/13 - 10:39
 * @Version:v1.0
 */

/**
 * 网站使用者，这是外部状态
 */
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
