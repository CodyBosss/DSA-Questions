import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Collection_PriorityQueue {
    public static void main(String[] args) {
        // Queue<Integer> pq = new PriorityQueue<>();
        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.offer(90);
        pq.offer(20);
        pq.offer(30);
        pq.offer(10);
        pq.offer(50);
        pq.offer(200);

        // priority queue implements min heap thats why it stores lowest value at front.
        // System.out.println("Initial Queue : " + pq);

        // By using Comparator we can implament Max heap which stores largest value at
        // front.
        System.out.println(pq);

        System.out.println("We can show the data at once using peek : " + pq.peek());
        System.out.println();
        System.out.println("Using poll we can delete the data : " + pq.poll());
    }

}
