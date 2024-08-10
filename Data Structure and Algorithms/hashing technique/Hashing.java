import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// HashMap Example

class Hashing {
    public static void main(String[] args) {

        Map<String, Integer> hm = new HashMap<>();

        hm.put("Pune", 1);
        hm.put("Shirur", 2);
        hm.put("Kolhapur", 3);
        hm.put("Nagar", 4);

        System.out.println(hm.size());
        if (hm.containsKey("Shirur")) {
            Integer a = hm.get("Shirur");
            System.out.println(a);
        }
    }
}