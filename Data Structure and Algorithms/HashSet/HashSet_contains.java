import java.util.HashSet;
import java.util.Set;

public class HashSet_contains {

    public static void main(String[] args) {
        Set<String> hs = new HashSet<>();

        hs.add("Shirur");
        hs.add("Nagar");
        hs.add("Pune");
        hs.add("Kolhapur");

        // Used to return true if an element is present in a set.

        boolean res = hs.contains("Pune");
        System.out.println(res);
    }

}
