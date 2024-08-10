// String replace (char oldChar, char newChar)
// Returns new string by replacing all occurrences of oldChar with newChar.

public class Stringreplace {

    public static void main(String[] args) {
        String s = "Ronny";
        System.out.println(test(s));
    }

    public static String test(String s) {
        String res = s.replace('R', 'S');
        return res;
    }

}
