// int compareToIgnoreCase( String anotherString) 
// Compares two string lexicographically, ignoring case considerations.

public class String_compareToIgnoreCase {

    public static void main(String[] args) {
        String s = "Sudhir";
        String s1 = "Khandare";
        String str = new String("Sudhir");
        System.out.println(test(s, s1, str));
    }

    public static int test(String s, String s1, String str) {

        int a = s.compareToIgnoreCase(str);
        return a;

    }

}
