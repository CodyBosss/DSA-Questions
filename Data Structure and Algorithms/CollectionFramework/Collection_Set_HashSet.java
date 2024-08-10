import java.util.HashSet;
import java.util.Set;

public class Collection_Set_HashSet {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(50);
        set.add(100);
        set.add(60);

        // HashSet stores elements in unordered sequence.
        System.out.println(set);
        System.out.println();

        // set.remove(50);
        // System.out.println("Removes the item from the elements : " + set);

        // set.clear();
        // System.out.println(set);

        System.out.println();
        System.out.println("Size of items : " + set.size());

        System.out.println();
        System.out.println("to check elements are present or not in items : " + set.contains(100));
    }

}
