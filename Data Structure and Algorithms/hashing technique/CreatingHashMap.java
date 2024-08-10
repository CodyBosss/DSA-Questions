import java.util.HashMap;
import java.util.Map;

public class CreatingHashMap {

    public static void main(String[] args) {
        Map<String, Integer> hm = new HashMap<>();
        hm.put("Sudhir", 1);
        hm.put("Ronny", 2);
        hm.put("Chinti", 3);
        hm.put("Bala", 4);

        System.out.println(hm.get("Bala"));
        hm.remove("Bala");

        System.out.println(hm.containsKey("Bala"));
        System.out.println(hm.size());

    }

}
