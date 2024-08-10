import java.util.HashMap;
import java.util.Map;

// clear method:- Removes all of the mappings from this map.

public class ClearMethod {

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("sudhir", 1);
        hm.put("bala", 2);
        hm.put("rony", 3);

        System.out.println(hm);

        hm.clear();

        System.out.println("after clear : " + hm);
    }

}
