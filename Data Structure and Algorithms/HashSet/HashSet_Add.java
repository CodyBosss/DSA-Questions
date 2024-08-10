import java.util.HashSet;
import java.util.Set;

public class HashSet_Add {
    public static void main(String[] args) {
        Set<Integer> hs = new HashSet<>();

        // Used to add the specified element if it is not present,
        // if it is present then return false.

        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);
        hs.add(5);

        System.out.println("HashSet Elements are : " + hs);

    }
}