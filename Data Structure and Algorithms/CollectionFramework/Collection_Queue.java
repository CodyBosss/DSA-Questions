import java.util.Queue;

// Using Linked List
class Collection_Queue {
    public static void main(String[] args) {
        Queue<Integer> q = new java.util.LinkedList<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);
        q.offer(50);
        System.out.println("peek will print firstly inserted item in queue : " + q.peek());

        q.poll();
        System.out.println(q);
    }
}