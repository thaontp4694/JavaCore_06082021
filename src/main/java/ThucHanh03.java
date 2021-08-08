import java.util.Scanner;

public class ThucHanh03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Bài 1:
//        Viết chương trình xét 1 năm có phải năm nhuận hay không?
//        Năm nhuận là năm chia hết cho 400 hoặc chia hết cho 4 đồng thời không chia hết cho 100.
        System.out.println("Bài 1");
        System.out.print("Input year: ");
        int year1 = scanner.nextInt();
        if ((year1 % 4 == 0 && year1 % 100 != 0) || (year1 % 400 == 0)) {
            System.out.println("This is a leap year");
        } else {
            System.out.println("This is not a leap year");
        }
    }
}