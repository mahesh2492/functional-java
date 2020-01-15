package imperative;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class LeadersArray {
    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }

        long nextLong()
        {
            return Long.parseLong(next());
        }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void foo(int []a, int n) {
        boolean flag ;
        ArrayList<Integer> al = new ArrayList<>() ;
        al.add(a[n - 1]) ;
        for(int i = n - 2; i >= 0 ; i--) {
            flag = false ;
            for(int j = i + 1; j < n; j++) {
                if(a[i] >= a[j]) {
                    flag = true;
                } else {
                    flag = false ;
                    break;
                }
            }

            if(flag) {
                al.add(a[i]) ;
            }
        }

        System.out.println(al);
        for(int i = al.size() - 1 ; i >= 0 ; i--)
            System.out.print(al.get(i) + " ");
    }

    public static void main (String[] args) {
        int t, n ;
        FastReader sc = new FastReader() ;
        t = sc.nextInt() ;

        while(t-- > 0) {
            n = sc.nextInt() ;
            int[] a = new int[n] ;

            for(int i = 0 ; i < n; i++) {
                a[i] = sc.nextInt() ;
            }

            foo(a, n);
            System.out.println();
        }
    }

}
