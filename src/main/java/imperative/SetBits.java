package imperative;

import java.util.Scanner;

public class SetBits {
    public static void main (String[] args) {
        int t;
        Scanner sc = new Scanner(System.in) ;
        t = sc.nextInt();
        while(t-- > 0) {
            int num = sc.nextInt();
            System.out.println(Integer.toBinaryString(num).replaceAll("0", "").length()) ;
        }
    }
}
