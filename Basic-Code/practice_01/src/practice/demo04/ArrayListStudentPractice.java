package practice.demo04;
//输入三个学生的信息，遍历打印
import practice.demo04.ArrayListStudentDemo;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListStudentPractice {

    public static void main(String[] args) {
        ArrayList<ArrayListStudentDemo> studentList = new ArrayList<>();
        //输入学生信息
        for (int i = 0; i < 3; i++) {
            ArrayListStudentDemo stu = new ArrayListStudentDemo();
            //输入学生姓名
            System.out.print("请输入第" + (i + 1) +"个学生姓名：");
            Scanner scName = new Scanner(System.in);
            stu.setName(scName.next());
            //输入学生年龄
            System.out.print("请输入第" + (i + 1) +"个学生年龄：");
            Scanner scAge = new Scanner(System.in);
            stu.setAge(scAge.nextInt());
            //输入学生性别
            System.out.print("第" + (i + 1) +"个学生是否为男生：");
            Scanner scMale = new Scanner(System.in);
            stu.setMale(scMale.nextBoolean());

            //存储学生信息
            studentList.add(stu);
        }
        System.out.println("======================================");
        //打印学生信息
        System.out.println("输入的学生信息为：");
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println("第" + (i + 1) + "名学生姓名是：" + studentList.get(i).getName());
            System.out.println("第" + (i + 1) + "名学生年龄是：" + studentList.get(i).getAge());
            System.out.println(studentList.get(i).isMale());
        }
    }

}
