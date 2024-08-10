import java.util.HashMap;

public class Find_Itineriry_From_Tickets {

    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("Chennai", "Bangaluru");
        hm.put("Mumbai", "Delhi");
        hm.put("Delhi", "Goa");
        hm.put("Goa", "Chennai");

        String start = getStart(hm);

        while (hm.containsKey(start)) {
            System.out.print(start + "->");
            start = hm.get(start);
        }
        System.out.println(start);
    }

    public static String getStart(HashMap<String, String> tick) {

        HashMap<String, String> revMap = new HashMap<>();

        for (String key : tick.keySet()) {
            revMap.put(tick.get(key), key);
        }
        for (String key : tick.keySet()) {
            if (!revMap.containsKey(key)) {
                return key;
            }
        }
        return null;
    }

}