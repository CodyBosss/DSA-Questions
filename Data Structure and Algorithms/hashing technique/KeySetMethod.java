import java.util.HashMap;

public class KeySetMethod {

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("sudhir", 4);
        hm.put("bala", 2);
        hm.put("rony", 3);

        // Returns a Set view of the keys contained in this map.
        System.out.println(hm.keySet());
    }

}
