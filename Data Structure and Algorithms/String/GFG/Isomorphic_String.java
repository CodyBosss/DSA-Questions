import java.util.HashMap;
import java.util.Map;

public class Isomorphic_String {
    public static void main(String[] args) {
        String str1 = "aab";
        String str2 = "xxgknfjsnv";
        System.out.println(test(str1, str2));
    }

    public static boolean test(String str1, String str2) {
        if (str1.length() != str2.length())
            return str1.equals(str2);

        HashMap<Character, Character> m = new HashMap<>();
        char c = ' ';
        for (int i = 0; i < str1.length(); i++) {
            if (m.containsKey(str1.charAt(i))) {
                c = m.get(str1.charAt(i));
                if (c != str2.charAt(i))
                    return false;
            } else if (!m.containsValue(
                    str2.charAt(i))) {
                m.put(str1.charAt(i),
                        str2.charAt(i));
            } else {
                return false;
            }
        }
        return true;
    }

}
