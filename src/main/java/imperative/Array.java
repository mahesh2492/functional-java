package imperative;

import java.util.HashMap;
import java.util.Map;

public class Array {
    public static void main(String[] args) {
        int [][] arr = { {1, 2}, {3, 4} };
        Map<String, String> data = new HashMap<String, String>();

        data.put("1", "abc");
        System.out.println(data);
        data.put("1", "abcefgh");
        System.out.println(data);
        for(int i = 0; i < 2; i++ ) {
          for(int j = 0; j < 2; j++) {
              System.out.println("arr[" + i + "][" + j + "] = " + arr[i][j]);
          }
        }
        int num = 10 ;

        System.out.println(Integer.toBinaryString(num).replaceAll("0", "").length()) ;
    }
}
