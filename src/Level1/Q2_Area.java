package Level1;

import java.util.Scanner;

public class Q2_Area {


    public static void main(String[] args) {
        System.out.println("Enter Width in cm");
        Scanner sc1= new Scanner(System.in);
        int a= sc1.nextInt();
        System.out.println("Enter Height in cmt");
        Scanner sc2= new Scanner(System.in);
        int b= sc2.nextInt();

        int c= a*b;

        System.out.println("Area is "+c+"cm2");

    }
}