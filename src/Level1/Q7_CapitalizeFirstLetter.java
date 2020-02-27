package Level1;

import java.util.Scanner;

public class Q7_CapitalizeFirstLetter {
    public static void main(String[] args) {
        Scanner sc1= new Scanner(System.in);
        String s= sc1.nextLine();

        String upper_case_line= " ";

        Scanner sc= new Scanner(s);

        while(sc.hasNext()) {
            String word = sc.next();
            upper_case_line =  upper_case_line+Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";

        }System.out.println( upper_case_line);
    }
}
