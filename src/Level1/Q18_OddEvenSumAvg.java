package Level1;

import java.util.Arrays;
import java.util.Scanner;

public class Q18_OddEvenSumAvg {

        public static void main(String[] args)
        {
            int n, sum = 0;
            Scanner s = new Scanner(System.in);
            System.out.print("Enter no. of elements you want in array:");
            n = s.nextInt();
            int nums[]= new int[n];

            System.out.println("Enter all the elements:");
            for(int i = 0; i < n; i++)
            {
                nums[i] = s.nextInt();

            }

            int even = 0, odd = 0;
            System.out.println("Original Array: "+ Arrays.toString(nums));

            for(int i = 0; i < nums.length; i++) {
                if(nums[i] % 2 == 0)
                {
                    even++;
                }
                else
                    odd++;
            }
            System.out.printf("\nNumber of even elements in the array: %d",even);
            System.out.printf("\nNumber of odd elements in the array: %d",odd);
            System.out.printf("\n");
        }
    }

