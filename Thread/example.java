

public class example {
    public static void main(String[] args) {
        a obj1 = new a();
        b obj2 = new b();

        obj1.start();
        obj2.start();
    }

    static  class a extends Thread{
        public void run() {
            for (int i = 0; i <= 10; i++) {
                System.out.println("Hiii");
            }
        }
    }

    static  class b extends Thread {

        public void run() {
            for (int i = 0; i <= 10; i++) {
                System.out.println("Hello");
            }
        }
    }
}
