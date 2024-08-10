import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ToStringMethod {
    public static void main(String[] args) {
        ArrayList<AbstractMap.SimpleEntry<Integer, Integer>> list = new ArrayList<AbstractMap.SimpleEntry<Integer, Integer>>();

        list.add(new AbstractMap.SimpleEntry<>(0, 123));
        list.add(new AbstractMap.SimpleEntry<>(1, 130));
        list.add(new AbstractMap.SimpleEntry<>(2, 994));

        for (int i = 0; i < list.size(); i++) {
            // get map from list
            AbstractMap.SimpleEntry<Integer, Integer> map = list.get(i);

            // get representation of map using toString().
            String value = map.toString();

            System.out.println(value);

        }
    }
}
