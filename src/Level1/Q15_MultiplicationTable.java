package Level1;

import java.util.Scanner;

public class Q15_MultiplicationTable {

        public static void main(String[] args)
        {
            Scanner s = new Scanner(System.in);

            System.out.print("Enter number:");

            int n=s.nextInt();

            for(int i=1; i <= 10; i++)

            {

                System.out.println(n+" X "+i+" = "+n*i);

            }

        }

    }

