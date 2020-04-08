package practice.demo05;
/*
* 字符串常用方法
* 1.== 是进行字符串的地址值比较，如果需要比较字符串的内容，那么可以使用两个方法
* public boolean equals(Object obj) :参数可以试试任何对象
* 只有参数是一个字符串，并且内容相同才会返回true，否则为false
* 注意事项
* 1)任何对象都能用Object接收
* 2)equals具有对称性，也就是a.equals(b)和b.equals(a)效果一样。
* 3)如果一个常量和一个变量比较，推荐把常量字符串写在前面。如果变量是一个null值，放在前面时会出现空指针异常，NullPointerException
*
* 2.public boolean equalsIgnoreCase(String str);忽略大小写，进行内容的比较；
* */
public class StringMethod {
    public static void main(String[] args) {
        String str1 = "Hello,World";
        String str2 = "Hello,World";
        char[] ch = new char[]{'H','e','l','l','o',',','W','o','r','l','d'};
        String str3 = new String(ch);
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1.equals(ch));
        System.out.println("Hello,World".equals(str1));
        System.out.println("===========================");
        String str4 = "Hello";
        String str5 = "hELLO";
        System.out.println(str5.equalsIgnoreCase(str5));
    }
}
