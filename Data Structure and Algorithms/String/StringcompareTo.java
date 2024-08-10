// int compareTo( String anotherString) 
// Compares two string lexicographically.

public class StringcompareTo {
    public static void main(String[] args) {
        String s = "Sudhir";
        String s1 = "Sudhir";
        System.out.println(test(s, s1));
    }

    public static int test(String s, String s1) {

        int res = s.compareTo(s1);
        return res;
    }
}
