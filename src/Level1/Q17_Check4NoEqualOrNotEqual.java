package Level1;

import java.util.Scanner;

public class Q17_Check4NoEqualOrNotEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        if (a == b && a == c && a == c && a == d) {
            System.out.println("They are equal");
        } else System.out.println("not equal");

    }
}
