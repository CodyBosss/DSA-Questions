// String concat( String str)
// Concatenates specified string to the end of this string.

public class StringConcat {
    public static void main(String[] args) {
        String s = "Sudhir";
        String s1 = "Khandare";
        System.out.println(test(s, s1));
    }

    public static String test(String s, String s1) {
        String str = s.concat(s1);
        return str;
    }
}