package Level1;

import java.util.Scanner;

public class Q19_StarPattern {
    public static void main(String[] args) {
        System.out.println("enter num");
        Scanner sc= new Scanner(System.in);
        int i= sc.nextInt();

        for(int j=0; j<i; j++){
            for(int k=0; k<j; k++){
            System.out.print("*");}
            System.out.println();
        }
    }
}
