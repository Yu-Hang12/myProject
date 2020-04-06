package practice.demo04;

public class ArrayListStudentDemo {
    private String name;
    private int age;
    private boolean male;

    public ArrayListStudentDemo() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMale() {
        System.out.print("是男生吗：");
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }
}
