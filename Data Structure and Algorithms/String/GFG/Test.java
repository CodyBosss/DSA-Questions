import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        String str1 = "aab";
        String str2 = "xxy";
        System.out.println(test(str1, str2));
    }

    public static boolean test(String str1, String str2) {

        if (str1.length() != str2.length())
            return str1.equals(str2);

        Map<Character, Character> map = new HashMap<>();
        char ch = ' ';
        for (int i = 0; i < str1.length(); i++) {
            if (map.containsKey(str1.charAt(i))) {
                ch = map.get(str1.charAt(i));

                if (ch != str2.charAt(i))
                    return false;
            } else if (!map.containsValue(str2.charAt(i))) {
                map.put(str1.charAt(i), str2.charAt(i));
            } else {
                return false;
            }
        }
        return true;
    }
}
