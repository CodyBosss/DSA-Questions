import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Test {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        String patt = "set";
        int n = str.length();
        int m = patt.length();
        System.out.println(test(str, patt, n, m));
    }

    public static int test(String str, String patt, int n, int m) {

        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(str, patt);
        }
    }
}