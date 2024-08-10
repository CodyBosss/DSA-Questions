import java.util.HashSet;

public class HashSet_Clear {

    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();

        hs.add("Sudhir");
        hs.add("Bala");
        hs.add("Ronny");
        hs.add("Chinti");

        // Used to remove all the elements from the set.
        hs.clear();
        System.out.println(hs);
    }

}
