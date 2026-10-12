package pepository.exercise.java;

public class T05 {
    public static void main(String[] args) {
        //求圆的周长和面积
        final double PI=3.14;    //π
        double r=2.5;   //圆的半径在数学中表示为r

        //周长公式为2×π×r
        double c=2*PI*r;
        //面积公式为π×r×r
        double a=PI*r*r;
        System.out.println("圆的周长为"+c+"圆的面积为"+a);
    }
}
