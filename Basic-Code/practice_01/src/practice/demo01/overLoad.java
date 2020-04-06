package practice.demo01;

public class overLoad {
    public static void main(String[] args) {
        System.out.println(calcu((short)10,20));
    }

    public static int calcu(int a, int b){
        return a + b;
    }

    public static int calcu(int a, short b){
        return a * b;
    }

    /*
        1.与方法名称有关，名称必须相同
        2.与不同类型参数顺序有关，与参数数量有关。
        3，与返回值无关。
    */
}


