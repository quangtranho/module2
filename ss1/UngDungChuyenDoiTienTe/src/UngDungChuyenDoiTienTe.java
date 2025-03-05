import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class UngDungChuyenDoiTienTe {
    public static void main(String[] args) {
        System.out.println("Ứng Dụng Chuyển Đổi Tiền Tệ\n" +
                "1:VND=>USD\n" +
                "2:USD=>VND\n");
        Scanner sc = new Scanner(System.in);
        int chon = sc.nextInt();
        switch (chon) {
            case 1:
                System.out.printf("Nhập VND :");
                double VND = sc.nextDouble();
                double USD = VND / 23000;
                System.out.println(USD+" USD");
                break;
            case 2:
                System.out.println("Nhập USD :");
                double USD2 = sc.nextDouble();
                double VND2 = USD2 * 23000;
                System.out.println(VND2+" USD");
                break;

        }
    }
}
