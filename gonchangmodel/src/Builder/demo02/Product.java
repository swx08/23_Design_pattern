package Builder.demo02;

/**
 * ClassName:Product
 * Package:Builder.demo02
 * Description
 *
 * @Author:@wenxueshi
 * @Create:2023/4/11 - 22:58
 * @Version:v1.0
 */

/**
 * 具体的产品：套餐
 */
public class Product {
    private String buildA = "可乐";
    private String buildB = "汉堡";
    private String buildC = "薯条";
    private String buildD = "甜点";

    public String getBuildA() {
        return buildA;
    }

    public void setBuildA(String buildA) {
        this.buildA = buildA;
    }

    public String getBuildB() {
        return buildB;
    }

    public void setBuildB(String buildB) {
        this.buildB = buildB;
    }

    public String getBuildC() {
        return buildC;
    }

    public void setBuildC(String buildC) {
        this.buildC = buildC;
    }

    public String getBuildD() {
        return buildD;
    }

    public void setBuildD(String buildD) {
        this.buildD = buildD;
    }

    @Override
    public String toString() {
        return "Product{" +
                "buildA='" + buildA + '\'' +
                ", buildB='" + buildB + '\'' +
                ", buildC='" + buildC + '\'' +
                ", buildD='" + buildD + '\'' +
                '}';
    }
}
