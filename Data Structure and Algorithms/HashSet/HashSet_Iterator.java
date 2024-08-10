import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class HashSet_Iterator {
    public static void main(String[] args) {
        Set<String> hs = new HashSet<>();

        hs.add("Shirur");
        hs.add("Nagar");
        hs.add("Pune");
        hs.add("Kolhapur");

        // Used to return an iterator over the element in the set.
        Iterator<String> it = hs.iterator();
        // System.out.println(it.next());
        // System.out.println(it.next());
        // System.out.println(it.next());
        // System.out.println(it.next());

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
