package practice.demo04;

//数组长度不可以改变，但是ArrayList长度可以改变
/*对于ArrayList来说，有一个<E>代表泛型
 * 泛型：也就是装在集合中的所有元素，全都是统一的什么类型
 * 注意：泛型只能是引用类型，不能是基本类型
 *
 * 如果想要在ArrayList中存储基本类型，必须使用基本类型的包装类
 * 基本类型   包装类(引用类型 包装类都位于java.lang包下)
 * byte     Byte
 * short    Short
 * int      Integer
 * long     Long
 * char     Character
 * boolean  Boolean
 * float    Float
 * double   Double
 *从java 1.5开始，支持自动装箱，自动拆箱
 * 自动装箱：基本类型->包装类型(自动)
 * 自动拆箱：包装类型->基本类型(自动)
 *
 * 对于ArrayList来说，直接打印的不是地址值，而是内容，如果内容是空那么得到的是空的中括号：[]
 *
 * */

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        /*创建了一个名称为list的ArrayList集合，里面装的全都是String字符串
        注意：从JDK 1.7开始，之后的版本右侧的尖括号内可以不写泛型，但是尖括号必须存在*/
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);

//        向集合添加数据，需要使用add方法
        list.add("Hello");
        list.add("World");
        System.out.println(list);//会使用都好隔开

        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(1000);
        System.out.println(list1);
    }

}

/*ArrayList常用的方法
1.public boolean add(E e)；//向集合中添加元素，参数的类型和泛型一致
对于ArrayList来说，add添加一定是成功的，但是对于其他的类来说，结果不一定是成功的，所以返回值表示添加是否成功
2.public E get(int index);//从集合中获取地index的数据
3.public E remove(int index);//从集合中删除第index的数据并返回
4.public int size();//获取集合的尺寸长度，返回值是长度
*/
