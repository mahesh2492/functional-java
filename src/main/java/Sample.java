
import java.util.Arrays;
import java.util.List;


public class Sample {

    //Imperiative style of coding
    public static Boolean findCity(String name, List<String> cities) {
        boolean found = false;
        for (String city : cities) {
            if (city.equals(name)) {
                found = true;
                break;
            }
        }
        return found;
    }

    public static void main(String[] args) {
        List<String> cities = Arrays.asList("Delhi", "Banglore", "Punjab", "Uttrakhand");
        System.out.println( "Imperiative style  "+ findCity("Delhi", cities));

        //Functional style
        System.out.print("Functional style  "+cities.contains("Delhi"));
    }
}