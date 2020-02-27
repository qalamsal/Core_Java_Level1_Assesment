package Level1;

import java.util.Scanner;

public class Q20_RandomStartPattern {
    public static void main(String[] args) {
        System.out.println("Random No of Stars to Generate");
        int no1 = new Scanner(System.in).nextInt();

        char msg = '0';
        int count = 0;
        for (int row = 0; row < no1; row++) {
            count++;
            for (int col = 0; col <= row; col++) {

                if (count == 1) {
                    msg = '*';
                } else if (count == 2) {
                    msg = '#';
                } else if (count == 3) {
                    msg = '^';
                } else {
                    count = 1;
                    msg = '*';
                }

                System.out.print(msg);

            }

            System.out.println();
        }
    }
}



