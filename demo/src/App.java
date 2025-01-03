import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Enter a:");
        Scanner numberOne = new Scanner(System.in);
        int a = numberOne.nextInt();
        System.out.println("Enter b:");
        Scanner numberTwo = new Scanner(System.in);
        int b = numberTwo.nextInt();
        if(a==0){
            System.out.println("Phương trình vô nghiệm");
        }else if(b==0){
            System.out.println("Phương trình vô số nghiệm");
        }else {
            double x = (double)a/b;
            System.out.println(x);
        }
    }
}
