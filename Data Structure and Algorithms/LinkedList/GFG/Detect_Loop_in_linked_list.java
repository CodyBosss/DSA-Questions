class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class Detect_Loop_in_linked_list {

    public static void main(String[] args) {
        System.err.println(detectLoop(null));
    }

    public static boolean detectLoop(Node head) {
        int value[] = { 1, 3, 4 };
        int N = 3;
        int x = 2;

        Node fast = head.next;
        Node slow = head;

        while (fast != slow) {
            if (fast == null || fast.next == null)
                return false;

            fast = fast.next.next;
            slow = slow.next;
        }
        return true;
    }

}