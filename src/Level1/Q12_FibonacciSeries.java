package Level1;

import java.util.Scanner;

public class Q12_FibonacciSeries {
        public static void main(String[] args)
        {
            System.out.println("Enter the numbers");
            Scanner sc= new Scanner(System.in);
            int maxNumber = sc.nextInt();
            int previousNumber = 0;
            int nextNumber = 1;

            System.out.print("Fibonacci Series of "+maxNumber+" numbers:");

            for (int i = 1; i <= maxNumber; ++i)
            {
                System.out.print(previousNumber+" ");

                int sum = previousNumber + nextNumber;
                previousNumber = nextNumber;
                nextNumber = sum;
            }

        }

    }

