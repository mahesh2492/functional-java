package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] agrs) {
        List<String> animals = new ArrayList<>() ;

        //adding new elements to array list
        animals.add("lion");
        animals.add("wolf");
        animals.add("fox");
        animals.add("cat");

        System.out.println(animals);

        //adding an elment at particular index
        animals.add(2, "dog") ;
        System.out.println("Size of animals " + animals.size());

        //retrieve the elements at particular index
        String value = animals.get(2);

        System.out.println(value);

    }
}
