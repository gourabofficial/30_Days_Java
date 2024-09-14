
import java.util.HashSet;
import java.util.Set;

public class MeargeTwoArray {
    public static void main(String[] args) {
        Set<Integer> arr1 = new HashSet<>();
        Set<Integer> arr2 = new HashSet<>();

        arr1.add(1);
        arr1.add(2);
        arr1.add(3);
        arr1.add(4);

        arr2.add(1);
        arr2.add(12);
        arr2.add(2);
        arr2.add(31);
        arr2.add(4);

        System.out.print("the hole array : " + arr1);
        System.out.println();
        System.out.print("the hole array : " + arr2);
        System.out.println();


        arr1.addAll(arr2);
        System.out.print("After meargin : " + arr2);

    }
}
