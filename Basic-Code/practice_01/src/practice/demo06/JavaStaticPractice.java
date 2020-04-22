package practice.demo06;
/*
 * static 关键字，不需要创建对象就可以存在类中的数据，静态数据，凡是本类的对象，都共享同一份
 * 如果一个成员变量使用了static关键字，那么这个成员变量就不属于对象自己，而是属于所在的类，多个对象共享同一份数据
 *
 * 成员方法如果有了static关键字，那么不需要创建对象直接就可以通过类名称来使用
 *
 * 不论是成员变量，还是成员方法，有了static，都推荐使用类名称调用
 *
 * 注意：
 * 1.在一个类中，静态不可以访问非静态，也就是一个类中的成员方法可以访问类中的成员变量，也可以访问静态变量，但是静态方法，只能访问静态变量，不能直接访问非静态变量。
 * 原因：因为在内存中是【先】有的静态内容，【后】有的非静态内容
 * 【先】不知道【后】，但【后】知道【先】
 * 2.静态方法中不能使用this，因为this代表当前对象。静态方法与对象无关
 * */

public class JavaStaticPractice {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.setStuName("Liming");
        stu1.setStuAge(20);
        Student.stuClass = 101;
        System.out.println("姓名:" + stu1.getStuName() + ",年龄:" + stu1.getStuAge() + ",学号:" + stu1.getStuNum() + ",班级:" + stu1.stuClass);

        Student stu3 = new Student("Han Mei", 15);
        System.out.println("姓名:" + stu3.getStuName() + ",年龄:" + stu3.getStuAge() + ",学号:" + stu3.getStuNum() + ",班级:" + stu3.stuClass);

        Student stu2 = new Student("Han Meimei", 15);
        System.out.println("姓名:" + stu2.getStuName() + ",年龄:" + stu2.getStuAge() + ",学号:" + stu2.getStuNum() + ",班级:" + stu2.stuClass);

        stu1.MethodStatic();//正确 不推荐，容易误以为普通成员方法，这种写法在编译时也会被javac翻译为Student.MethodStatic();
        Student.MethodStatic();//正确 推荐

        //对于本类中的静态方法，在本类中调用时可以省略类名

    }
}
