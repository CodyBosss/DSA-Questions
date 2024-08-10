import java.util.HashSet;
import java.util.Set;

public class HashSet_remove {
    public static void main(String[] args) {
        Set<String> hs = new HashSet<>();

        hs.add("Shirur");
        hs.add("Nagar");
        hs.add("Pune");
        hs.add("Kolhapur");

        // Used to remove the element if it is present in set.
        hs.remove("Pune");
        System.out.println(hs.contains("Pune"));
        System.out.println(hs);
    }

}
