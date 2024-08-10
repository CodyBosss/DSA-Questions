public class StringindexOf {

    public static void main(String[] args) {
        String str = "Sudhir Khadnare is my name";
        System.out.println(test(str));
    }

    public static int test(String str) {

        int index = str.indexOf("is");
        return index;

    }
}
