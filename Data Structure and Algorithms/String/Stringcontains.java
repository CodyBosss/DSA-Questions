public class Stringcontains {

    public static void main(String[] args) {
        String s = "Sudhirkhandare";
        String s1 = "Sudhir";
        System.out.println(test(s, s1));
    }

    public static boolean test(String s, String s1) {
        boolean res = s.contains(s1);
        return res;
    }

}
