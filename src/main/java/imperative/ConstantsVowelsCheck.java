package imperative;

import sun.security.pkcs11.wrapper.Constants;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConstantsVowelsCheck {

    public static int countVowels(String s) {
        int vowelsCount = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'A' || c == 'a' || c == 'E' || c == 'e' || c == 'I' || c == 'i' || c == 'O' || c == 'o' || c == 'U' || c == 'u') {
                ++vowelsCount;
            }
        }
        return vowelsCount;
    }

    static void checkString(String s) {
        int v = 0;
        int c = 0;
        v = countVowels(s);
        c = s.replace(" ", "").length() - 1 - v;

        if (v > c)
            System.out.print("Yes");
        else if (c > v)
            System.out.print("No");
        else
            System.out.print("Same");

        System.out.println();
    }

    public static void main(String[] args) {
        ConstantsVowelsCheck.checkString("the quick brown fox jumps over the lazy dog");
        ConstantsVowelsCheck.checkString("a i u e o t m n s w");
    }
}
