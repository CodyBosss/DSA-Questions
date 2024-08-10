import java.util.Scanner;

public class ParenthesisChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the parenthesis : ");
        String s = sc.nextLine();

        if (backetcheck(s, sc)) {
            System.out.println("balanced");
        } else {
            System.out.println("Not balanced");
        }
    }

    public static boolean backetcheck(String s, Scanner sc) {
        int i = -1;
        char[] stack = new char[s.length()];
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack[++i] = ch;
            } else {
                if (i >= 0
                        && ((stack[i] == '(' && ch == ')')
                                || (stack[i] == '{' && ch == '}')
                                || (stack[i] == '[' && ch == ']')))
                    i--;
                else
                    return false;
            }

        }
        return i == -1;
    }
}
