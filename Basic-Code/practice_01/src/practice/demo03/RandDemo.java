package practice.demo03;

import java.util.Random;
import java.util.Scanner;

public class RandDemo {
    public static void main(String[] args) {

        Random ran = new Random();
        int num = ran.nextInt();
        System.out.println("随机得到的数字是：" + num);
        int num1 = ran.nextInt(100);

        System.out.println("猜出位于[0-100）之间的随机数字");
        System.out.println("请输入猜想的数字：");
        while (true) {
            Scanner sc = new Scanner(System.in);
            int temp = sc.nextInt();
            if (num1 == temp) {
                System.out.println("恭喜猜中数字！！！");
                break;
            } else if (num1 > temp) {
                System.out.println("猜到的数字太小了！！！");
            } else {
                System.out.println("猜到的数字太大了");
            }
            System.out.println("再试一次！！");
        }

    }
}
