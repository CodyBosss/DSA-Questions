import java.util.HashMap;
import java.util.Map;

public class TraversalHashMap {
    public static void main(String[] args) {
        Map<Integer, String> hm = new HashMap<>();

        hm.put(1, "sudhir");
        hm.put(2, "bala");
        hm.put(3, "ronny");
        hm.put(4, "chinti");

        for (Map.Entry<Integer, String> e : hm.entrySet()) {

            System.out.println("key : " + e.getKey() + " value : " + e.getValue());

        }
    }
}
