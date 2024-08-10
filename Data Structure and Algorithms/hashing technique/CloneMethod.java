import java.util.HashMap;

public class CloneMethod {

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("sudhir", 1);
        hm.put("bala", 2);
        hm.put("rony", 3);

        System.out.println("before clone : " + hm);

        // Returns a shallow copy of this HashMap instance:
        // the keys and values themselves are not cloned.
        Object res = hm.clone();
        System.out.println("After clone : " + res);

    }

}
