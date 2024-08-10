import java.util.LinkedHashSet;
import java.util.Set;

public class Collection_Set_LinkedHashSet {

    public static void main(String[] args) {
        Set<Integer> lhs = new LinkedHashSet<>();
        lhs.add(10);
        lhs.add(50);
        lhs.add(100);
        lhs.add(60);
        lhs.add(10);

        System.out.println(lhs);

    }
}
