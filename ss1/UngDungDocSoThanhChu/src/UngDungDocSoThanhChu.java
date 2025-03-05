import java.util.Scanner;

public class UngDungDocSoThanhChu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập số cần đọc (0 - 999): ");
        int number = sc.nextInt();
        if (number > 0 && number < 10) {
        switch (number) {
            case 0: System.out.println("zero"); break;
            case 1: System.out.println("one"); break;
            case 2: System.out.println("two"); break;
            case 3: System.out.println("three"); break;
            case 4: System.out.println("four"); break;
            case 5: System.out.println("five"); break;
            case 6: System.out.println("six"); break;
            case 7: System.out.println("seven"); break;
            case 8: System.out.println("eight"); break;
            case 9: System.out.println("nine"); break;
        }
        }else if (number >= 10&&number < 20) {
            switch (number) {
                case 10: System.out.println("ten"); break;
                case 11: System.out.println("eleven"); break;
                case 12: System.out.println("twelve"); break;
                case 13: System.out.println("thirteen"); break;
                case 14: System.out.println("fourteen"); break;
                case 15: System.out.println("fifteen"); break;
                case 16: System.out.println("sixteen"); break;
                case 17: System.out.println("seventeen"); break;
                case 18: System.out.println("eighteen"); break;
                case 19: System.out.println("nineteen"); break;
            }
        }else if (number >= 20&&number < 100) {
            int ones = number % 10;
            int tens = number / 10;
            String one="";
            String ten="";
            String numberWord="";
            switch (ones) {
                case 1: one="one"; break;
                case 2: one="two"; break;
                case 3: one="three"; break;
                case 4: one="four"; break;
                case 5: one="five"; break;
                case 6: one="six"; break;
                case 7: one="seven"; break;
                case 8: one="eight"; break;
                case 9: one="nine"; break;
            }
            switch (tens) {
                case 2: ten ="twenty"; break;
                case 3: ten ="thirty"; break;
                case 4: ten ="forty"; break;
                case 5: ten ="fifty"; break;
                case 6: ten ="sixty"; break;
                case 7: ten ="seventy"; break;
                case 8: ten ="eighty"; break;
                case 9: ten ="ninety"; break;
            }
            numberWord=ten+" "+one;
            System.out.println(numberWord);
        }else if (number >= 100&&number < 1000) {
            int hundreds = number / 100;
            int remainder = number % 100;
            String hundred="";
            String numberWord="";
            int hund=0;
            switch (hundreds) {
                case 1: hundred ="one hundred";hund=100;break;
                case 2: hundred ="two hundred";hund=200;break;
                case 3: hundred ="three hundred";hund=300;break;
                case 4: hundred ="four hundred";hund=400;break;
                case 5: hundred ="five hundred";hund=500;break;
                case 6: hundred ="six hundred";hund=600;break;
                case 7: hundred ="seven hundred";hund=700;break;
                case 8: hundred ="eight hundred";hund=800;break;
                case 9: hundred ="nine hundred";hund=900;break;
            }
            int ones = remainder % 10;
            int tens = remainder / 10;
            String one="";
            String ten="";
            switch (tens) {
                case 2: ten ="twenty"; break;
                case 3: ten ="thirty"; break;
                case 4: ten ="forty"; break;
                case 5: ten ="fifty"; break;
                case 6: ten ="sixty"; break;
                case 7: ten ="seventy"; break;
                case 8: ten ="eighty"; break;
                case 9: ten ="ninety"; break;
            }
            switch (ones) {
                case 1: one="one"; break;
                case 2: one="two"; break;
                case 3: one="three"; break;
                case 4: one="four"; break;
                case 5: one="five"; break;
                case 6: one="six"; break;
                case 7: one="seven"; break;
                case 8: one="eight"; break;
                case 9: one="nine"; break;
            }
            numberWord=hundred+" "+"and "+ten+" "+one;
            System.out.println(numberWord);
        }
        else {
            System.out.println("out of ability");
        }

    }
}
