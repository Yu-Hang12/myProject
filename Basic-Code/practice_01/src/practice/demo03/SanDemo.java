package practice.demo03;

import java.util.Scanner;

public class SanDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a number");
        int num = sc.nextInt();
        System.out.println("输入的Int类型数据是：" + num);

        System.out.println("please enter a word12");
        String str = sc.next();
        System.out.println("输入的字符串是：" + str);
    }
}
