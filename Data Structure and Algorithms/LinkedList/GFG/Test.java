import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Test {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        al.add(300);
        al.add(200);
        al.add(10);
        al.add(5);

        System.out.println(al);

        Collections.reverse(al);
        System.out.println(al);
    }
}