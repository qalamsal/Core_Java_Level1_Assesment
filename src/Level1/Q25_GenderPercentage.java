package Level1;

import java.util.Scanner;

public class Q25_GenderPercentage {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter total no. of students");
        int t= sc.nextInt();
        System.out.println("Enter no. of males");
        int m= sc.nextInt();
        int f= t-m;
        double pf= f*100/t;
        double pm= m*100/t;
        System.out.println("no.of Females is "+ f);
        System.out.println("% of females is "+pf + "%");
        System.out.println("% of males is "+ pm+ "%");

    }
}
