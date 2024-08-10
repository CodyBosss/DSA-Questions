import java.util.Scanner;

public class BT_Traversal_UsingRecursionWithLL {

    static Node create() {
        Scanner sc = new Scanner(System.in);
        Node root = null;
        System.out.println("Enter Value : ");
        int data = sc.nextInt();
        root = new Node(data);
        if (data == -1)
            return null;
        System.out.println("Enter the left child of " + root.data);
        root.left = create();
        System.out.println("Enter the right child of " + root.data);
        root.right = create();
        return root;
    }

    static void inorder(Node root) {
        if (root == null)
            return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    static void preorder(Node root) {
        if (root == null)
            return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    static void postorder(Node root) {
        if (root == null)
            return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {
        Node root = create();
        System.out.println();
        System.out.println("Inorder BT : ");
        inorder(root);
        System.out.println("\nPreorder BT : ");
        preorder(root);
        System.out.println("\nPostorder BT : ");
        postorder(root);
    }
}

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
