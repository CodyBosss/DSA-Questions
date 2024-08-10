import java.util.HashMap;

/**
 * HashCodeMethod
 */
public class HashCodeMethod {

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("sudhir", 4);
        hm.put("bala", 2);
        hm.put("rony", 3);

        // Returns the hash code value for this map.
        System.out.println(hm.hashCode());
    }

}