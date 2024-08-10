import java.util.HashSet;
import java.util.Set;

public class HashSet_size {

    public static void main(String[] args) {
        Set<String> hs = new HashSet<>();
        hs.add("Shirur");
        hs.add("Nagar");
        hs.add("Pune");
        hs.add("Kolhapur");
        hs.add("Pune");

        // Used to return the size of the set.
        int res = hs.size();
        System.out.println(res);
    }

}
