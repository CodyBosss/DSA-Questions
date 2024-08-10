import java.util.HashMap;

public class EqualsMethod {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("sudhir", 4);
        hm.put("bala", 2);
        hm.put("rony", 3);

        HashMap<String, Integer> hm1 = new HashMap<>();
        hm1.put("sudhir", 4);
        hm1.put("bala", 2);
        hm1.put("rony", 3);
        // hm1.put("Chinti", 1);

        // Compares the specified object with this map for equality.
        System.out.println(hm.equals(hm1));
    }
}
