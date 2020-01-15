package imperative;

public class  PatternMatcher {
    public static void foo(String s) {
       if(s.contains("xy")) {
           foo(s.replace("xy", "")) ;
       } else if(s.isEmpty()) {
           System.out.println(1);
       } else {
           System.out.println(0);
       }

    }

    public static void main(String[] agrs) {
        String str = "xxyyxxyy";
        foo(str);
    }
}
