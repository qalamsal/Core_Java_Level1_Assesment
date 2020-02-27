package Level1;

import java.util.Scanner;

public class Q3_Swap {

        public static void doswap(){
        System.out.println("Enter value a");
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        System.out.println("Enter value b");
        Scanner sc2= new Scanner(System.in);
        int b= sc.nextInt();

        int c=a;

            a=b;
            b=c;
            System.out.println("a is "+a);
            System.out.println("b is "+ b);

        }

    public static void main(String[] args) {
            doswap();


    }

        }


