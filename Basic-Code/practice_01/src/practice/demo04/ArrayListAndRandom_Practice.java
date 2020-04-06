package practice.demo04;

import java.util.ArrayList;
import java.util.Random;

//生成6个1-33之间的随机数，放入ArrayList中，并遍历输出
public class ArrayListAndRandom_Practice {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            Random num = new Random();
            int temp = num.nextInt(33) + 1;
            list.add(temp);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
