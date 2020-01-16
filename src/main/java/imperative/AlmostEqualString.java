package imperative;

import java.util.Arrays;

import static java.lang.Math.abs;

public class AlmostEqualString {

    static int coutChars(String s1, String s2) {
        int []chars = new int[26];
        for(char c : s1.toCharArray()){
            chars[c - 'a']++;
        }
        for(char c : s2.toCharArray()){
            chars[c - 'a']--;
        }
        int count = 0 ;
        for(int r : chars){
            count = count + Math.abs(r);
        }
        return  count;

    }

    public static void main(String[] args) {
        String s1 = "cgudllrbrjlgvxuheeuwpewiylhnthzprofdxysmsgwkcztglzedalvcgostfavcmxpcvyhzpqhffojqqytooathdjfxyezuhbpu" ;
        String s2 = "dniciuehstodlqxhhcydvccfpbbpczqdiczfwhsgdbvrgewfyajbahsicalrxhavovgxdwkinrcmwpmpxurkuxtrfdpencvkvxvs" ;

        System.out.println(coutChars(s1, s2));
    }
}
