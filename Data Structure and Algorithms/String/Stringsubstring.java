public class Stringsubstring {

    // Return the substring from the ith index character to end.
    public static void main(String[] args) {
        String str = "GeeksforGeeks";
        System.out.println(SubString(str));
    }

    public static String SubString(String str) {

        String n = str.substring(4);
        return n;
    }

}
