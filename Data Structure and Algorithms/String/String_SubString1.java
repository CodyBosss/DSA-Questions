
// String substring (int i, int j)
// Returns the substring from i to j-1 index.

public class String_SubString1 {
    public static void main(String[] args) {
        String str = "GeeksforGeeks";
        System.out.println(StringSubString(str));
    }

    public static String StringSubString(String str) {
        String res = str.substring(2, 5);
        return res;
    }

}
