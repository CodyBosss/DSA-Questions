import java.util.HashMap;
import java.util.Map;

public class ChangingElement {

    public static void main(String[] args) {
        Map<Integer, String> hm = new HashMap<>();

        hm.put(1, "Sudhir");
        hm.put(2, "Bala");
        hm.put(3, "rony");

        System.out.println(hm);

        hm.put(3, "Ronny");
        System.out.println(hm);
    }

}
