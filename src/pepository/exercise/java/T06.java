package pepository.exercise.java;

public class T06 {
    public static void main(String[] args) {
        //类型的转换

        //自动转换
        double num1=1.5;
        int num2=5;
        double a=num2+num1; //num2被自动转换成了double类型
        System.out.println(a);

        //手动转换
        double anum1=2.5;
        int anum2=(int)anum1;     //num1被手动转换成了int
        System.out.println(anum2);

    }
}
