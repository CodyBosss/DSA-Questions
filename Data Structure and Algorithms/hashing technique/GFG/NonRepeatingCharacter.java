import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class NonRepeatingCharacter {

    public static void main(String[] args) {
        String s = "hello";
        int n = s.length();
        System.out.println(test(s, n));
        // test(s, n);
    }

    public static char test(String s, int n) {

        char[] c = s.toCharArray();
        Map<Character, Integer> m = new HashMap<>();
        for (int i = 0; i < n; i++) {
            m.put(c[i], m.getOrDefault(c[i],0)+1)
        }
        char res = ' ';
        for(int i=0; i<n; i++){
            if(m.get(c[i])==1){
                res = c[i];
                return res;
            }
        }
        return '$';
    }

}
