import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * ReverseString
 */
public class ReverseString {

    public static void main(String[] args) {
        String str = "geek";
        System.out.println(test(str));
        // test(str);
    }

    public static String test(String str) {
        Set<Character> hs = new LinkedHashSet<>();
        char[] c = str.toCharArray();
        for (char res : c) {
            hs.add(res);
        }
        StringBuilder sb = new StringBuilder();
        for (char res : hs) {
            sb.append(res);
        }
        return sb.toString();

    }
}