import java.util.HashMap;

public class EntrySetMethod {

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("sudhir", 1);
        hm.put("bala", 2);
        hm.put("rony", 3);

        // Returns a Set view of the mappings contained in this map.
        System.out.println(hm.entrySet());
    }

}
