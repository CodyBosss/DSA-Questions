// boolean equals( Object otherObj)
// Compares this string to the specified object.

public class String_boolean {

    public static void main(String[] args) {
        String s = "sudhir";
        String s1 = "sk";
        System.out.println(test(s, s1));
    }

    public static boolean test(String s, String s1) {
        boolean res = s.equals(s1);
        return res;
    }
}
