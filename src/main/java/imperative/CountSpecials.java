package imperative;

import java.util.HashMap;

class CountSpecials {

    static void countSpecials(int[] a, int n, int k) {
        int f = (int) Math.floor(n / k);

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int value : a) {
            if (map.containsKey(value)) {
                map.put(value, map.get(value) + 1);
            } else {
                map.put(value, 1);
            }
        }

        System.out.println(
                map.values()
                        .stream()
                        .filter(e -> e == f)
                        .count()
        );
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 1, 2, 4 };

        CountSpecials.countSpecials(a, 5, 2);

    }
}
