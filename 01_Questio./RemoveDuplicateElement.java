import java.util.HashSet;
import java.util.Set;



public class RemoveDuplicateElement {


public class Duplicate {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(2);
        set.add(4);
        set.add(5);
        set.add(3);
        set.add(5);

        System.out.println(set); // set will automatically remove duplicates
    }
}
}
