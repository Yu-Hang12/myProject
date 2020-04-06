package practice.demo02;

//标准类要有下面四个组成部分
/*1.所有成员变量都需要使用private关键字私有化
2.为每一个成员变量编写一对儿getter/setter方法
3.编写一个无参数的构造方法
4.编写一个全参数的构造方法

一个标准类也叫作一个JAVA bean*/
public class Standard {
    private String feature1;
    private int feature2;
    private boolean feature3;

    //    setter方法
    public void setFeature1(String feature1) {
        this.feature1 = feature1;
    }

    public void setFeature2(int feature2) {
        this.feature2 = feature2;
    }

    public void setFeature3(boolean feature3) {
        this.feature3 = feature3;
    }

    //    getter方法
    public String getFeature1() {
        return feature1;
    }

    public int getFeature2() {
        return feature2;
    }

    public boolean isFeature3() {
        return feature3;
    }

    //    无参数构造方法
    public Standard() {
    }

    //    全参数构造方法

    public Standard(String feature1, int feature2, boolean feature3) {
        this.feature1 = feature1;
        this.feature2 = feature2;
        this.feature3 = feature3;
    }
}
