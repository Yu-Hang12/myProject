package practice.demo02;

import org.w3c.dom.ls.LSOutput;

//当成员方法的局部变量与成员变量名称相同时，成员方法会根据就近原则优先使用局部变量。如果需要访问本类中的成员变量，需要使用一种格式：this.成员变量
// (通过谁调用的方法，谁就是this：this的地址和对象的地址相同)
//成员变量直接定义在类当中,在成员方法外
//成员方法 不要写static关键字
/*
* 定义一个类：用来模拟学生事物
* 属性：姓名，年龄
* 行为：吃饭，睡觉，学习
* 对应到Java的类当中
*
* 局部变量与成员变量的区别：
* 1.定义的位置不一样，局部变量：在方法的内部；成员变量：在类中，在方法的外部；
* 2.作用域不一样，局部变量：只能在方法中使用；成员变量：在类中可以随意使用；
* 3.默认值不同，局部变量没有默认值，成员变量有默认值；
* 4.内存的位置不一样：局部变量位于方法栈内存，成员变量位于堆内存
* 5.生命周期不一样：局部变量：随着方法进栈诞生，随着方法出栈消失；成员变量：随着对象的创建诞生，随着对象被垃圾回收而消失
*
* 成员变量(属性)：
* String name；
* int age；
* 成员方法(行为)：
* public void eat() {}  //吃饭
* public void sleep() {}  //睡觉
* public void study() {}  //学习
*
* */
public class Student {

    String name;
    private int age;//直接设置private是错误的

    //专门用于设置age，名称规则：set + 成员变量首字母大写
    public void setAge(int num){
        age = num;
    }
//    专门用于获取age，名称规则：get + 成员变量首字母大写（boolean 例外：is + 成员变量首字母大写）
    public int getAge(){
        return age;
    }

    public void eat() {
        System.out.println("吃饭");
    }

    public void sleep() {
        System.out.println("睡觉");
    }

    public void study() {
        System.out.println("学习");
    }

}
