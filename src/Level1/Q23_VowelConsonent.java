package Level1;

import java.util.Scanner;

public class Q23_VowelConsonent {

        public static void main(String[] args) {
            System.out.println("enter a character");
            Scanner sc=new Scanner(System.in);;
            String a= sc.next();
            char ch = a.charAt(0);


            if(a.length()==1&&ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'||ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' )
                System.out.println(ch + " is vowel");
            else if(a.length()==1)
                System.out.println(ch + " is consonant");
            else  if (a.length()>1)
                System.out.println("too many characters");
            else System.out.println("invalid entry");



        }
    }

