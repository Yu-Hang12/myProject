package practice.demo01;

import java.util.Arrays;

public class Array {
    //    1.动态数组是指定义时指定长度
    //    2.静态数组是指定义时指定内容
    //    动态数组格式：int[] num = new int[8]; 如果是整形：默认为0，浮点型：0.0，字符型：'\u0000',boolean型：false，引用类型：null；
    //    静态数组格式：int[] = new int[] {元素1，元素2};也有默认值过程，之后立即赋值
    //    静态数组的省略格式：int[] num = {元素1，元素2，...};
    /*静态数组和动态数组都能拆封成为两个格式，但是静态数组的省略格式不可以拆分*/
    //数组名称.length 获取int类型的数组长度，数组一旦创建，在程序运行期间，长度不会改变
    public static void main(String[] args) {
        int[] num = new int[8];
        String[] str = new String[]{"Hello", "World"};

        int[] num1;
        int[] num2;
        num1 = new int[5];
        num2 = new int[]{1, 2, 3, 75, 656, 5435, 23342, 2266666, 2266666, 3, 3, 5, 56, 6, 74, 3, 4};

        System.out.println(str[0] + ' ' + str[1]);

        //System.out.println("数组中最大的数字是：" + ArrayMaxNum(num2));
        for (int i = 0; i < num2.length; i++) {
            System.out.print(num2[i] + " ");
        }
        System.out.print('\n');

        //翻转
        ArrayReserve(num2);

        for (int i = 0; i < num2.length; i++) {
            System.out.print(num2[i] + " ");
        }
        System.out.println();

        System.out.println(Arrays.toString(num2));
    }

    public static int ArrayMaxNum(int[] array) {

        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if (array[j] < array[i]) {
                    int temp = 0;
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        return array[0];
    }

    public static void ArrayReserve(int[] array) {
        for (int i = 0; i < (array.length / 2); i++) {
            int temp = 0;
            temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }
}

/*java 内存分为5个部分：

1.栈内存 stack：存放的是方法中的局部变量，一旦超出作用域，立刻从栈内存中消失。（方法要一定运行在栈当中）
2.堆内存 heap: 凡是new出来的东西，都在堆当中，并且都有一个16进制的地址值。
    堆内存中的数据都有默认值:同上（数组）。
3.方法区 method area：存储.class相关信息，包含方法的信息。
4.本地方法栈 native method stack：与操作系统相关
5.寄存器 pc register：与CPU相关*/
