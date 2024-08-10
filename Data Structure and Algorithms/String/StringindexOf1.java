// int indexOf (String s, int i)
// Returns the index within the string of the first occurrence of the specified string, starting at the specified index

public class StringindexOf1 {

    public static void main(String[] args) {
        String s = "My dream is to crack google and one day i will make my dream fullfil";
        System.out.println(test(s));
    }

    public static int test(String s) {
        int res = s.indexOf("cr", 5);
        return res;
    }

}
