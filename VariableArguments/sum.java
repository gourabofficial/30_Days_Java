public class sum {

    public static void main(String[] args) {

        int result = sum(1, 2, 3, 4, 5);
        System.out.println("sum is: " +result);
    }

    public static int sum(int a, int b, int ... c) {
        int sum = a + b;
        for (int i : c) {
            sum = sum + i;
          
        }
        return sum;
    }
}
