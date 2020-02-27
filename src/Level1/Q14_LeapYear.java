package Level1;

import java.util.Scanner;

public class Q14_LeapYear {
    public static void main(String[] args) {
        System.out.println("eneter year");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year % 4 == 0 || year % 400 == 0) {
            System.out.println("it is leap year");
        } else {
            System.out.println("Hell No");
        }
    }
}
