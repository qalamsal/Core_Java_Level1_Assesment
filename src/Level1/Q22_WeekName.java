package Level1;

import java.time.DayOfWeek;
import java.util.Scanner;

public class Q22_WeekName {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        System.out.println(DayOfWeek.of(k).toString());
    }
}
