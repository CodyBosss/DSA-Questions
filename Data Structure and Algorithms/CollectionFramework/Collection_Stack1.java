import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Collection_Stack1 {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Elements : ");
        for (int i = 0; i < 5; i++) {
            int n = sc.nextInt();
            stack.push(n);
        }

        System.out.println(stack);

        // stack.push(10);
        // stack.push(20);
        // stack.push(30);
        // stack.push(40);
        int d = stack.peek(); // [1,2,3,4] element at top is 4
        System.out.println("Element at the top is : " + d);

        System.out.println();
        System.out.println("element on the top is deleted : " + stack.peek());

        System.out.println();
        int a = stack.search(40);
        System.out.println("Element at selected position : " + a);

        System.out.println();
        if (!stack.isEmpty()) {
            System.out.println("Poped elements are : " + stack.pop());
        }

        System.out.println("After poping list is : " + stack);

    }
}
