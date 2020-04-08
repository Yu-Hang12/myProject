package practice.demo04;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> charList = new ArrayList<>();
        Random ran = new Random();

        //向集合中添加元素
        for (int i = 0; i < 20; i++) {
            charList.add(ran.nextInt(100));
        }

        //打印集合数据
        printArrayList(charList);
    }

    public static void printArrayList(ArrayList<Integer> list) {
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i < (list.size() - 1)) {
                System.out.print("@");
            }
        }
        System.out.println("}");
    }
}
