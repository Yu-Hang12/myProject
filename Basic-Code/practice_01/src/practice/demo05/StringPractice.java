package practice.demo05;

//import java.lang.String代表字符串类
//API文档中描述：Java 程序中的所有字符串字面值（如 "abc" ）都作为此类的实例实现。
//意思就是：程序中所有双引号的字符串，都是一个String类的对象(没有new，也是对象)

/*
* 字符串特点
* 1.在Java中，字符串内容永不可变
* 2.正因为字符串不可改变，那么字符串是可以共享使用的
* 3.字符串效果上相当于char[]字符数组，但是底层原理是byte[]字节数组
*
*
* 创建字符串的3+1种方式
* 3种构造方法
* 1)public String();创建一个空白字符串，不含有任何内容
* 2)public String(char[] array);根据字符数组的内容，来创建对应的字符串
* 3)public String(byte[] array);根据字节数组的内容，来创建对应的字符串
* 1种直接创建
* String str = "Hello, World";右边直接用双引号
* */
public class StringPractice {
    public static void main(String[] args) {
        //使用空参构造
        String str1 = new String();//小括号为空，说明什么内容都没有
        System.out.println(str1);

        //使用字符串数组入参构造
        char[] ch = new char[]{'1','2','3'};
        String str2 = new String(ch);
        System.out.println(str2);

        //使用字节串数组入参构造
        byte[] byt = new byte[]{48,49,67};
        String str3 = new String(byt);
        System.out.println(str3);
    }
}

/* 从JDK 1.7开始，字符串常量池在堆当中。
* 字符串常量池：程序当中直接写上的双引号字符串，就在字符串常量池中
*对于基本类型来说，==是进行数值的比较
* 对于引用类型来说，==是进行地址值的比较
*
* */
