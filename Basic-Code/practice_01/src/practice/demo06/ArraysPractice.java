package practice.demo06;

/*
* java.util.Arrays是一个与数组相关的工具类，里面提供大量的静态方法，用来实现数组的常见操作
*
* public static String toString(数组);将参数数组按照默认格式变成字符串返回
* public static void sort(数组);按照默认升序(从小到大)对数组元素进行排序
* 注意:
* 1.如果是数字，按照数字大小升序，如果是字母，按照顺序升序
* 2.如果是自定义的类，那么需要类有Comparable和Comparator接口的支持
* */

import java.util.Arrays;
import java.util.Random;

public class ArraysPractice {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,12,12,122,1,3,14};
        String str1 = Arrays.toString(array1);
        System.out.println(str1);

        String[] array2 = new String[]{"gsgsg","aaa","tete"};
        Arrays.sort(array2);
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
        String str3 = Arrays.toString(array2);
        System.out.println(str3);
    }

}
