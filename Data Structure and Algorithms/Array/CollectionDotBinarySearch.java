import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionDotBinarySearch {

    // Main driver method
    public static void main(String[] args) {

        // Creating empty List
        List<Integer> al = new ArrayList<Integer>();

        // Adding elements to the List
        al.add(12);
        al.add(53);
        al.add(23);
        al.add(46);
        al.add(54);

        // Using binarySearch() method of Collections class
        // over random inserted element and storing the
        // index
        int index = Collections.binarySearch(al, 23);

        // Print and display the index
        System.out.print(index);
    }
}