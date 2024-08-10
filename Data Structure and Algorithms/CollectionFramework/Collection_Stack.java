import java.util.Stack;

public class Collection_Stack {

    static void stackPush(Stack<Integer> stack) {
        for (int i = 0; i < 5; i++) {
            Integer n = (Integer) stack.push(i);
            System.out.println("stack pushed : " + n);
        }
        System.out.println();
    }

    static void stackPop(Stack<Integer> stack) {
        System.out.println("Pop Operations : ");
        for (int i = 0; i < 5; i++) {
            Integer y = (Integer) stack.pop();
            System.out.println("Poped elements : " + y);
        }
        System.out.println();
    }

    static void stack_peek(Stack<Integer> stack) {

        Integer element = (Integer) stack.peek();
        System.out.println("Elements on stack top is : " + element);

    }

    static void stack_search(Stack<Integer> stack, int element) {
        Integer pos = (Integer) stack.search(element);

        if (pos == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element is found at position: " + pos);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stackPush(stack);
        stackPop(stack);
        stackPush(stack);
        stack_peek(stack);
        stack_search(stack, 2);
    }

}
