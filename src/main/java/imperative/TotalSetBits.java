package imperative;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TotalSetBits {

    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();

        while (t-- > 0) {
            int num = sc.nextInt();
            int sum = 0;
            for (int i = 1; i <= num; i++) {
                sum += Integer.toBinaryString(i).replaceAll("0", "").length();
            }
            System.out.println(sum);
        }
    }
}

