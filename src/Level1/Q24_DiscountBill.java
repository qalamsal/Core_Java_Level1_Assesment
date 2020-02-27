package Level1;

import java.util.Scanner;

public class Q24_DiscountBill {
    public static void main(String[] args) {
        int sum = 0;
        System.out.println("enter no. of items");
        Scanner sc = new Scanner(System.in);
        int noOfItem = sc.nextInt();
        for (int i = 1; i <= noOfItem; i++) {
            System.out.println("enter price fot item " + i);
            int p = sc.nextInt();
            sum = sum + p;
        }
        System.out.println("Your Bill");
        System.out.println("Price: " + sum);
        System.out.println("Tax 5%");
        System.out.println(".................");
        System.out.println("Do you want to tip. Enter 1 for yes, 2 to Skip");
        int option = sc.nextInt();
        if (option == 1) {
            System.out.println("enter tip amount");
            int tip = sc.nextInt();
            int tsum = sum + tip;
            double totalBill = 0.05 * tsum + tsum;
            System.out.println("Your bill is " + totalBill);
        } else {
            double ntsum = 0.05 * sum + sum;
            System.out.println("Your bill is " + ntsum);
        }
    }
}
