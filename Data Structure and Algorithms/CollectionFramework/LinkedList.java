import java.util.List;

public class LinkedList {

    public static void main(String[] args) {
        List<Integer> list = new java.util.LinkedList<Integer>();

        list.add(400);
        list.add(700);
        list.add(300);
        list.add(500);
        list.add(100);
        list.add(200);
        System.out.println("Intial LinkedList : " + list);

        System.out.println();
        list.set(1, 600);
        System.out.println("Updated LinkedList : " + list);

        System.out.println();
        list.remove(1);
        System.out.println("item removed from index 1 : " + list);

        System.out.println();
        System.out.println("After Iterating the LL : ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        System.out.println("\n");
        System.out.println("After converting the list into Array : ");
        Object[] a = list.toArray();
        for (Object no : a) {
            System.out.print(no + " ");
        }

        System.out.println("\n");
        System.out.println("size of List are : " + list.size());
    }
}
