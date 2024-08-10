public class Check_If_Two_String_Rotated_By_Two_Places {

    public static void main(String[] args) {
        String str1 = "p";
        String str2 = "q";
        System.out.println(test(str1, str2));
    }

    public static boolean test(String str1, String str2) {
        int p = 2;
        if (str1.length() < 2)
            return str1.equals(str2);

        if (str1.length() == 1)
            return str1.equals(str2);

        if (str1.length() != str2.length())
            return false;

        String res = str2.substring(p) + str2.substring(0, p);
        String ans = str2.substring(str2.length() - p) + str2.substring(0, str2.length() - p);
        return (str1.equals(res) || str1.equals(ans));

    }

}
