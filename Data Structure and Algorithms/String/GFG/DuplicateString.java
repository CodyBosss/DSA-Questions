public class DuplicateString {
    public static void main(String[] args) {
        String s = "gfg";
        System.out.println(test(s));
    }

    public static String test(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (res.indexOf(c) == -1)
                res += c;
        }
        return res;
    }
}
