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
*
* 3.字符串获取方法
* public int length();获取字符串中字符的个数
* public String concat(String str);将当前字符串和参数字符串拼接成为返回值
* public char charAt(int index);获取指定位置的单个字符
* public int indexOf(String str);查找参数字符串在本字符串第一次出现的索引位置，没有返回-1
*
* 4.字符串截取方法
* public String substring(int index);从参数索引指定位置到字符串末尾，返回新字符串
* public String substring(int begin, int end);从开始参数位置到结束参数位置，返回新字符串，[begin,end)左闭右开
*
* 5.字符串转换常用方法
* public char[] toCharArray(String str);将当前字符串拆分为字符数组作为返回值
* public byte[] getBytes(String str);获取当前字符串底层字节数组
* public String replace(CharSequence oldString, CharSequence newString);将所有老字符串替换为新字符串，并返回
* 备注：CharSequence意思就是可以接受字符串类型
*
* 6.字符串分割常用方法
* public String[] split(String regex);按照参数的规则，将字符串分为若干部分
* 注意事项：split方法的参数其实是一个“正则表达式”，今天要注意，如果要按照因为句号"."来切分，必须写成"\\."(两个反斜杠)
*
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
        str3 = str1.concat(str2);
        System.out.println(str3);
        System.out.println("======================");
        String str6 = "Hello,World";
        String[] str7 = str6.split("W");
        for (int i = 0; i < str7.length; i++) {
            System.out.println(str7[i]);
        }

    }
}
