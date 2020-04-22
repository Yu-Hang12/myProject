package practice.JavaPractice;

//题目：判断101-200之间有多少个素数，并输出所有素数

public class Question02 {
    /*public static void main(String[] args) {
        //存储101-200之间的素数
        int[] array = new int[100];
        int index = 0;
        //循环100-200之间的数
        for (int i = 101; i < 200; i++) {
            int j;
            for (j = 2; j < i; j++) {
                if (0 == (i % j)) {
                    break;
                }
            }
            if (j == i) {
                array[index] = i;
                index++;
                System.out.println("存在素数：" + i);
            }
        }
        System.out.println("101-200之间素数个数为" + index);
    }*/

    public static void main(String args[]) {
        int i, j, n, m, x;      //n是用来存储余数的；m是用来统计具体一个数的因子；
        n = 0;
        m = 0;
        x = 0;        //x是用来统计101~200之前素数的个数
        for (i = 101; i <= 200; i++) {             //两重循环
            for (j = 1; j <= i; j++) {
                n = i % j;                    //去余数，如果余数为零，就是该数的因子
                if (n == 0) {
                    m = m + 1;
                }      //统计某数有多少个因子
            }
            if (m == 2) {
                System.out.print(i + " ");
                x = x + 1;
            } //如果某数的因子只有两个，那它就一定是素数，那这个数就应该输出
            m = 0;            //一定要清零，不然会继续累加
        }
        System.out.println();
        System.out.println("在101~200之間一共有素數：" + x + "個");
    }
}
