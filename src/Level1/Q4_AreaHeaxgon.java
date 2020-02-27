package Level1;

import java.util.Scanner;

public class Q4_AreaHeaxgon {
    public static void main(String[] args) {
        System.out.println("Enter length of Hexagon ");
        Scanner sc= new Scanner(System.in);
        int s= sc.nextInt();

        double b= ((3 * Math.sqrt(3) *
                (s * s)) / 2);
        System.out.println("Area of Hexagon is "+b);
    }
}
