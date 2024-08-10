import java.util.HashMap;

public class GetMethod {

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("sudhir", 1);
        hm.put("bala", 2);
        hm.put("rony", 3);

        // Returns the value to which the specified key is mapped,
        // or null if this map contains no mapping for the key.
        int res = hm.get("sudhir");
        System.out.println(res);
    }

}
