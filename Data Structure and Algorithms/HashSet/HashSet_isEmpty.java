import java.util.HashSet;
import java.util.Set;

public class HashSet_isEmpty {
    public static void main(String[] args) {
        Set<String> hs = new HashSet<>();
        hs.add("Shirur");
        hs.add("Nagar");
        hs.add("Pune");
        hs.add("Kolhapur");

        // Used to check whether the set is empty or not.
        // Returns true for empty and false for a non-empty condition for set.
        boolean res = hs.isEmpty();
        System.out.println(res);
    }
}
