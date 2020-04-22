package practice.demo06;

public class Student {

    private String stuName;
    private int stuAge;
    private int stuNum;
    static int stuClass;
    private static int stuCounter = 0;

    static {
        //静态代码块内容
        //特点：当第一次用到本类时，静态代码块执行唯一的一次，静态内容总是优先于非静态，所以静态代码块比构造方法先执行
        //典型用途：一次性的对静态变量进行赋值
    }

    public static void MethodStatic() {
        //这是静态方法，静态方法不属于对象，而是属于类
        //如果没有static关键字，必须要先创建对象，才能通过对象使用它
        //对于静态方法来说，可以通过对象名来调用，也可以通过类名称来调用
    }


    public Student() {
        this.stuNum = ++stuCounter;
    }

    public Student(String stuName, int stuAge) {
        this.stuName = stuName;
        this.stuAge = stuAge;
        this.stuNum = ++stuCounter;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public int getStuAge() {
        return stuAge;
    }

    public void setStuAge(int stuAge) {
        this.stuAge = stuAge;
    }

    public int getStuNum() {
        return stuNum;
    }

    public void setStuNum(int stuNum) {
        this.stuNum = stuNum;
    }

    public static int getStuClass() {
        return stuClass;
    }

    public static void setStuClass(int stuClass) {
        Student.stuClass = stuClass;
    }

    public static int getStuCounter() {
        return stuCounter;
    }

    public static void setStuCounter(int stuCounter) {
        Student.stuCounter = stuCounter;
    }
}
