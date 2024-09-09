
public class strExample {

    public static void main(String[] args) {

        String result = MeargeString("Cristiano"," Ronaldo"," complete"," his"," 900"," goals");
        // MeargeString("Ronaldo complete his 900 goals");
        System.out.println(result);
    }

    public static String MeargeString(String... str) {
        String result = "";
        for (String i : str) {
            result += i;
        }
        return result;
    }
}
