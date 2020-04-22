package practice.demo06;

/*
 * java.lang.Math是数学相关的工具类，里面提供大量静态方法，完成数学运算相关操作
 *
 * public static double abs(double num);返回参数的绝对值
 * public static double ceil(double num);向上取整
 * public static double floor(double num);向下取整
 * public static long round(double num);四舍五入
 *
 * Math.PI:代表近似圆周率常量π(double)
 *
 * 小学数学真题：在-10.8到5.9之间，绝对值大于6或者小于2.1的整数有多少
 *
 * */

public class MathPractice {

    public static void main(String[] args) {
        int counter = 0;
        double temp = Math.ceil(-10.8);
        while(true) {

            if ((6 < Math.abs(temp)) || (2.1 > Math.abs(temp))) {
                counter++;
                System.out.println(temp);
            }

            if (5.9 < temp) {
                break;
            } else {
                temp++;
            }
        }

        System.out.println(counter);
    }

}
