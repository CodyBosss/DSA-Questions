// Int lastIndexOf( String s)
// Returns the index within the string of the last occurrence of the specified string.

public class StringlastIndexOf {

    public static void main(String[] args) {
        String str = "Sudhir Khandare";
        System.out.println(test(str));
    }

    public static int test(String str) {
        int s = str.lastIndexOf("a");
        return s;
    }
}
