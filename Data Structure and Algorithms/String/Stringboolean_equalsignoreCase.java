// boolean  equalsIgnoreCase (String anotherString)
// Compares string to another string, ignoring case considerations.

public class Stringboolean_equalsignoreCase {
    public static void main(String[] args) {
        String s = "sudhir";
        String s1 = "Sudhir";
        String s2 = "Sud";
        System.out.println(test(s, s1, s2));
    }

    public static boolean test(String s, String s1, String s2) {
        boolean b = s.equalsIgnoreCase(s1);
        boolean b1 = s.equalsIgnoreCase(s2);
        return b1;

    }
}