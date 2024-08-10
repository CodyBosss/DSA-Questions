public class String_trim {

    public static void main(String[] args) {
        String s = "     Sudhir       k      Handare       ";
        System.out.println(test(s));
    }

    public static String test(String s) {
        String res = s.trim();
        return res;
    }
}
