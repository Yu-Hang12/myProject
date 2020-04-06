package practice.demo02;
import practice.demo02.Student;

//匿名对象：只有右边的类名称，没有左边的名字,匿名对象只能使用一次
//格式：new 类名称();


//创建对象的步骤
//1.导包：指出需要使用的类在什么位置，格式：import.包名称.类名称;
//对于和当前类属于同一个包的情况，可以省略导包语句不写
//只有java.lang下的类不需要导包，其余的包都需要import语句
//2.创建 格式：类名称 对象名 = new 类名称();

//3.使用
//使用成员变量：格式：对象名.成员变量;
//使用成员方法：格式：对象名.成员方法(参数);
public class StudentDemo {
    public static void main(String[] args) {
        Student stu = new Student();
        System.out.println(stu.name);
        System.out.println(stu.getAge());

        stu.name = "Liming";
        stu.setAge(23);

        System.out.println(stu.name);
        System.out.println(stu.getAge());

        stu.eat();
        stu.sleep();
        stu.study();

        Standard sta1 = new Standard();
        Standard sta2 = new Standard("姓名", 20, true);

        System.out.println(sta1.getFeature1() +" " + sta1.getFeature2() + " " + sta1.isFeature3());

        sta1.setFeature1("HelloWord");
        sta1.setFeature2(20);
        sta1.setFeature3(false);

        System.out.println(sta1.getFeature1());
        System.out.println(sta1.getFeature2());
        System.out.println(sta1.isFeature3());

        System.out.println(sta2.getFeature1());
        System.out.println(sta2.getFeature2());
        System.out.println(sta2.isFeature3());


    }
}

/*
* 如果成员变量没有初始化赋值，那么会有默认值
* 1.String ： null
* 2.int ： 0
* 3.boolean ：false
* 4.double ： 0.0
* 5.字符型 : '\u0000'*/