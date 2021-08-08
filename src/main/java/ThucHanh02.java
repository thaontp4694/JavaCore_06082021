import java.util.Scanner;

public class ThucHanh02 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

//      Bài 1:
//      Nhập một số bất kỳ. Hãy đọc giá trị của số nguyên đó nếu nó có giá trị từ 1 đến 9,
//      ngược lại thông báo không đọc được.
//        System.out.println("Bài 1");
//          System.out.print("Input Number : ");
//          int inputNumber = scanner.nextInt();
//          String[] readNumber = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
//          if (inputNumber >= 1 && inputNumber <= 9) {
//              System.out.println("Input number is " + readNumber[inputNumber - 1]);
//           }
//           else {
//              System.out.println("Can not read input number");
//        }

//       Bài 2:
//       Nhập một chữ cái. Nếu là chữ thường thì đổi sang chữ hoa,
//       ngược lại đổi sang chữ thường.
        System.out.println("Bài 2");
          System.out.print("Input 1 character: ");
          String character2 = scanner.nextLine();
        char c2 = character2.charAt(0);
        if (Character.isUpperCase(c2) == true) {
              System.out.println("Lowercase: " + character2.toLowerCase());
        }
          else {
              character2.toUpperCase();
              System.out.println("Uppercase: " + character2.toUpperCase());
        }

//      Bài 3:
//      Giải phương trình bậc nhất ax + b = 0.
        System.out.println("Bài 3");
            System.out.print("Input A : ");
            int inputA3 = scanner.nextInt();
            System.out.print("Input B : ");
            int inputB3 = scanner.nextInt();
            if (inputA3 == 0) {
              if (inputB3 == 0) {
                  System.out.println("Phương trình có vô số nghiệm.");
              }
              else {
                  System.out.println("Phương trình vô nghiệm.");
              }
            }
            else
              System.out.println("Phương trình có nghiệm = " + ((-inputB3) / (float) inputA3));

//      Bài 4: Giải phương trình bậc hai ax2 + bx + c = 0.
        System.out.println("Bài 4");
            System.out.print("Input A : ");
            float inputA4 = scanner.nextInt();
            System.out.print("Input B : ");
            float inputB4 = scanner.nextInt();
            System.out.print("Input C : ");
            float inputC4 = scanner.nextInt();
        // kiểm tra các hệ số
            if (inputA4 == 0) {
                if (inputB4 == 0) {
                    System.out.println("Phương trình vô nghiệm!");
                }
                else {
                    System.out.println("Phương trình có một nghiệm: "
                        + "x = " + (- inputC4 / inputB4));
            }
            return;
        }
        // tính delta
        float delta = inputB4 * inputB4 - 4 * inputA4 * inputC4;
        float x1;
        float x2;
        // tính nghiệm
            if (delta > 0) {
                x1 = (float) ((-inputB4 + Math.sqrt(delta)) / (2 * inputA4));
                x2 = (float) ((-inputB4 - Math.sqrt(delta)) / (2 * inputA4));
                System.out.println("Phương trình có 2 nghiệm là: "
                    + "x1 = " + x1 + " và x2 = " + x2);
            }
            else if (delta == 0) {
                x1 = (-inputB4 / (2 * inputA4));
                System.out.println("Phương trình có nghiệm kép: "
                    + "x1 = x2 = " + x1);
            }
            else {
                System.out.println("Phương trình vô nghiệm!");
        }

//  Bài 5: Nhập 4 số nguyên a, b, c và d. Tìm số có giá trị nhỏ nhất (min).
        System.out.println("Bài 5");
        System.out.print("Input a : ");
        int a5 = scanner.nextInt();
        System.out.print("Input b : ");
        int b5 = scanner.nextInt();
        System.out.print("Input c : ");
        int c5 = scanner.nextInt();
        System.out.print("Input d : ");
        int d5 = scanner.nextInt();
        int min = a5;
        if (min > b5) {
            min = b5;
        }
        if (min >= c5) {
            min = c5;
        }
        if (min >= d5) {
            min = d5;
        }
        System.out.println("Min Number: " + min);

//  Bài 6: Nhập 4 số nguyên a, b, c và d.
//  Hãy sắp xếp giá trị của 4 số nguyên này theo thứ tự tăng dần.
        System.out.println("Bài 6");
        System.out.print("Input a : ");
        int a6 = scanner.nextInt();
        System.out.print("Input b : ");
        int b6 = scanner.nextInt();
        System.out.print("Input c : ");
        int c6 = scanner.nextInt();
        System.out.print("Input d : ");
        int d6 = scanner.nextInt();
        int[] arrangeNumbers = new int[]{a6, b6, c6, d6};
        int temp = 0;
        for (int i = 0; i < arrangeNumbers.length; i++) {
            for (int j = i + 1; j < arrangeNumbers.length; j++) {
                if (arrangeNumbers[i] > arrangeNumbers[j]) {
                    temp = arrangeNumbers[i];
                    arrangeNumbers[i] = arrangeNumbers[j];
                    arrangeNumbers[j] = temp;
                }
            }
        }
       System.out.print("Dãy số sắp xếp tăng dần: ");
        for (int i = 0; i < arrangeNumbers.length; i++) {
            System.out.println(arrangeNumbers[i] + " ");
        }

//        Bài 7: Tính tiền đi taxi từ số km nhập vào. Biết:
//        a. 1 km đầu giá 15000đ
//        b. Từ km thứ 2 đến km thứ 5 giá 13500đ
//        c. Từ km thứ 6 trở đi giá 11000đ
//        d. Nếu trên 120km được giảm 10% tổng tiền.
        System.out.println("Bài 7");
        final int firstKM = 15000;
        final int next4KM = 13500;
        final int above6Km = 11000;
        float money = 0;
        System.out.print("Input KM: ");
        int km = scanner.nextInt();
        if (km <= 0) {
            System.out.println("Invalid KM");
        } else if (km <= 1) {
            System.out.println("Fee: " + firstKM);
        } else if (km > 1 && km <= 5) {
            money = firstKM + (km-1)*next4KM;
            System.out.println("Fee: " + money);
        } else if (km >= 6) {
            money = firstKM + 4*next4KM + (km-5)*above6Km;
            System.out.println("Fee: " + money);
        } else if (km >= 120) {
            money = (float) ((firstKM + 4*next4KM + (km-5)*above6Km) * 0.9);
            System.out.println("Fee: " + money);
        }
//        Bài 8: Nhập vào tháng và năm. Cho biết tháng đó có bao
//        nhiêu ngày.
        System.out.println("Bài 8");
        System.out.print("Input month: ");
        int month = scanner.nextInt();
        System.out.print("Input year: ");
        int year = scanner.nextInt();
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("This month of " + year + "has 31 days.");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("This month of " + year + " has 30 days.");
                break;
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    System.out.println("This month of " + year + " has 29 days.");
                } else {
                    System.out.println("This month of " + year + " has 28 days.");
                }
                break;
            default:
                System.out.println("Invalid Month");
        }

//        Bài 9: Nhập độ dài 3 cạnh. Kiểm tra đó có phải là tam giác
//        không và là tam giác gì?
        System.out.print("Input a : ");
        int a9 = scanner.nextInt();
        System.out.print("Input b : ");
        int b9 = scanner.nextInt();
        System.out.print("Input c : ");
        int c9 = scanner.nextInt();
        if ((a9 + b9 > c9) || (a9 + c9 > b9) || (b9 + c9 > a9)) {
            System.out.println("This is a triangle");
        }
        if ((a9 == b9) || (b9 == c9) || (c9 == a9)) {
            System.out.println("This is an isosceles triangle");
        } else if ((a9 == b9) && (b9 == c9) && (c9 == a9)) {
            System.out.println("This is an equilateral triangle");
        } else if ((a9 * a9 == b9 * b9 + c9 * c9) || (b9 * b9 == a9 * a9 + c9 * c9) || (c9 * c9 == b9 * b9 + a9 * a9)) {
            System.out.println("This is a right triangle");
        } else {
            System.out.println("This is not a triangle");
        }
    }
}


