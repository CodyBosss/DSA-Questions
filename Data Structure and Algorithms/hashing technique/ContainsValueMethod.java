import java.util.HashMap;

public class ContainsValueMethod {

    public static void main(String[] args) {

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("sudhir", 1);
        hm.put("bala", 2);
        hm.put("rony", 3);

        // Returns true if this map maps one or more keys to the specified value.
        System.out.println(hm.containsValue(2));

    }
}