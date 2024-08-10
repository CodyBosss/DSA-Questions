import java.util.HashMap;
import java.util.Map;

public class RemovingElements {

    public static void main(String[] args) {
        Map<Integer, String> hm = new HashMap<>();
        hm.put(1, "sudhir");
        hm.put(2, "bala");
        hm.put(3, "Ronny");
        hm.put(4, "Chinti");

        hm.remove(2);
        System.out.println(hm);
    }

}
