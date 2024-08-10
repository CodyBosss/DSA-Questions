import java.util.HashSet;
import java.util.Set;

public class HashSet_toString {

    public static void main(String[] args) {
        Set<String> hs = new HashSet<>();
        hs.add("Shirur");
        hs.add("Nagar");
        hs.add("Pune");
        hs.add("Kolhapur");

        // The toString() method of Java HashSet is used to return a string
        // representation of the elements of the HashSet Collection.
        String res = hs.toString();
        System.out.println(res);
    }

}
