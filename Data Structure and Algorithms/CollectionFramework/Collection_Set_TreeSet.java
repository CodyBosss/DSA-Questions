import java.util.Set;
import java.util.TreeSet;

public class Collection_Set_TreeSet {
    public static void main(String[] args) {
        Set<Integer> ts = new TreeSet<>();
        ts.add(400);
        ts.add(200);
        ts.add(500);
        ts.add(100);

        // TreeSet Maintain data in sorted form because it maintain Set as well as
        // Binary Search Tree.
        System.out.println(ts);
    }
}
