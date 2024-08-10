import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

class Graph_Implementation {
    private LinkedList<Integer> adjecency[];

    public Graph_Implementation(int v) {
        adjecency = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adjecency[i] = new LinkedList<Integer>();
        }
    }

    public void insertedge(int s, int d) {
        adjecency[s].add(d);
        adjecency[d].add(s);
    }

    // breadth first search algorithm
    public void bfs(int source) {
        boolean visited_nodes[] = new boolean[adjecency.length];
        int parent_nodes[] = new int[adjecency.length];
        Queue<Integer> q = new LinkedList<>();
        q.add(source);
        visited_nodes[source] = true;
        parent_nodes[source] = -1;

        while (!q.isEmpty()) {
            int p = q.poll();
            System.out.println(p);
            for (int i : adjecency[p]) {
                if (visited_nodes[i] != true) {
                    visited_nodes[i] = true;
                    q.add(i);
                    parent_nodes[i] = p;
                }
            }
        }
    }

    // depth first search algorithm
    public void dfs(int source) {
        boolean visited_nodes[] = new boolean[adjecency.length];
        int parent_nodes[] = new int[adjecency.length];
        Stack<Integer> q = new Stack<>();
        q.add(source);
        visited_nodes[source] = true;
        parent_nodes[source] = -1;

        while (!q.isEmpty()) {
            int p = q.pop();
            System.out.println(p);
            for (int i : adjecency[p]) {
                if (visited_nodes[i] != true) {
                    visited_nodes[i] = true;
                    q.add(i);
                    parent_nodes[i] = p;
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of vertices and edges : ");
        int v = sc.nextInt();
        int e = sc.nextInt();
        Graph_Implementation g = new Graph_Implementation(v);
        System.out.println("Enter Edges : ");
        for (int i = 0; i < e; i++) {
            int s = sc.nextInt();
            int d = sc.nextInt();
            g.insertedge(s, d);
        }
        System.out.println("Enter source for bfs and dfs traversal : ");
        int source = sc.nextInt();
        System.out.println("bfs traversal");
        g.bfs(source);
        System.out.println("dfs traversal");
        g.dfs(source);
    }
}