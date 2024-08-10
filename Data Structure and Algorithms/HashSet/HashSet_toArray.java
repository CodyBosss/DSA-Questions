import java.util.HashSet;
import java.util.Set;

public class HashSet_toArray {

    public static void main(String[] args) {
        Set<String> hs = new HashSet<>();
        hs.add("Shirur");
        hs.add("Nagar");
        hs.add("Pune");
        hs.add("Kolhapur");

        // This method is used to form an array of the same elements as that of the Set.
        Object[] obj = hs.toArray();
        for (int i = 0; i < obj.length; i++) {
            System.out.println(obj[i]);
        }
    }

}
