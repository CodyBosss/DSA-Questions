import java.util.HashMap;

public class ContainsKeyMethod {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("sudhir", 1);
        hm.put("bala", 2);
        hm.put("rony", 3);

        // Returns true if this map contains a mapping for the specified key.
        boolean res = hm.containsKey("bala");
        System.out.println(res);
    }
}
