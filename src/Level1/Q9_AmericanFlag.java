package Level1;

public class Q9_AmericanFlag {
    public static void main(String[] args) {
        String a = "* * * * * * =========================";
        String b = " * * * * *  =========================";
        String c = "=====================================";
        for (int i = 1; i < 9; i++) {
            if (i % 2 != 0) {
                System.out.println(a);
            } else if (i % 2 == 0) {
                System.out.println(b);
            }
        }
        for(int j=1; j<6; j++){
            System.out.println(c);
        }
    }
}
