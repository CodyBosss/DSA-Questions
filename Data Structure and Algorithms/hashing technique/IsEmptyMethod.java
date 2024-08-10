import java.util.HashMap;

public class IsEmptyMethod {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("sudhir", 1);
        hm.put("bala", 2);
        hm.put("rony", 3);

        // Returns true if this map contains no key-value mappings.
        boolean res = hm.isEmpty();
        System.out.println(res);

    }
}
