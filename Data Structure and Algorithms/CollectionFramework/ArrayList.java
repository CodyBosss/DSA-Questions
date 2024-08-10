import java.util.*;

class ArrayList {
    public static void main(String[] args) {
        List<Integer> list = new java.util.ArrayList<>(); // same for LinkedList also.

        list.add(100); // i=o
        list.add(10); // i=1
        list.add(50); // i=2
        list.add(30); // i=3
        list.add(60); // i=4
        list.add(20); // i=5

        System.out.println("Intially List created : " + list);
        System.out.println();

        list.add(2, 40);
        System.out.println("after creating list, added one more elements at 2nd index : " + list);
        System.out.println();

        list.set(1, 70);
        System.out.println("new element replace with index 1 : " + list);

        System.out.println();
        list.remove(1);
        System.out.println("one element remove at 1st index : " + list);

        System.out.println();
        System.out.println("0th index element display : " + list.get(0));

        System.out.println();
        Collections.sort(list);
        System.out.println("Sorted elements : " + list);

        System.out.println();
        int n = list.size();
        System.out.println("size of list is : " + n);

        System.out.println();
        System.out.println("Element are present in array or not : " + list.contains(30));

        System.out.println();
        System.out.println("to check if given list is empty or not : " + list.isEmpty());

        System.out.println();
        System.out.println("by usinf forEach Method with lambda expression find the list of numbers");
        list.forEach((m) -> System.out.println(m));

        System.out.println();
        Object a[] = list.toArray();
        System.out.print("After converted LinkedList to Array: ");
        for (Object no : a) {
            System.out.print(no + " ");
        }

    }
}