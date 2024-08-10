import java.util.HashSet;
import java.util.Set;

public class HashSet_equals {

    public static void main(String[] args) {

        Set<String> hs = new HashSet<>();
        hs.add("Shirur");
        hs.add("Nagar");
        hs.add("Pune");
        hs.add("Kolhapur");

        Set<String> hs1 = new HashSet<>();
        hs1.add("Shirur");
        hs1.add("Nagar");
        hs1.add("Pune");
        hs1.add("Kolhapur");

        // Used to verify the equality of an Object with a HashSet and compare them.
        // The list returns true only if both HashSet contains the same elements,
        // irrespective of order.

        System.out.println(hs.equals(hs1));

    }

}
