package imperative;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class PredictColumn {

    static int columnWithMaxZero(int a[][],int n) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            hashMap.put(i, 0);
            for (int j = 0; j < n; j++) {
                    if(a[j][i] == 0)
                     hashMap.put(i, hashMap.get(i) + 1) ;
                }
            }

        return PredictColumn.findMaximumValue(hashMap);
    }

    static int findMaximumValue(HashMap<Integer, Integer> map) {
        int maxValueInMap=(Collections.max(map.values()));  // This will return max value in the Hashmap
        System.out.println(map.entrySet());
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {  // Itrate through hashmap
            if (entry.getValue() == maxValueInMap) {
                return entry.getKey();     // Print the key with max value
            }
        }
        return maxValueInMap ;
    }

    public static void main(String[] args) {
        int[][] a = { { 1, 1, 1, 0 }, { 1, 0, 0, 0 }, { 1, 1, 1, 0 }, { 0, 1, 1, 0 } };

        System.out.println(PredictColumn.columnWithMaxZero(a, 4));


        int arr[][] = new int[3][];
        arr[0] = new int[1];
        arr[1] = new int[2];
        arr[2] = new int[3];
        int sum = 0;

        for (int i = 0; i < 3; ++i)
            for (int j = 0; j < i + 1; ++j)
                arr[i][j] = j + 1;

        for (int i = 0; i < 3; ++i)
            for (int j = 0; j < i + 1; ++j)
                sum += arr[i][j];

        System.out.print(sum);
    }
    

}
