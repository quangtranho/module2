import java.util.Scanner;
public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("LinearEquationResolver");
        Scanner sc = new Scanner(System.in);
        System.out.println("a=");
        double a = sc.nextDouble();
        System.out.println("b=");
        double b = sc.nextDouble();
        if (a!=0){
            double x =(double) -(a/b);
            System.out.println("x="+x);
        } else if (a=0&&b!=0) {
            System.out.println("Phương trình vô số nghiệm");
        }
    }
}