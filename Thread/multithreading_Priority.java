
public class multithreading_Priority {

    public static void main(String[] args) {
        hi obj1 = new hi();
        hello obj2 = new hello();

        // obj1.setPriority(Thread.MIN_PRIORITY);
        // obj2.setPriority(Thread.MAX_PRIORITY);
        obj1.setPriority(10);
        obj2.setPriority(1);

        obj1.start();
        obj2.start();
    }

    public static class hi extends Thread {

        public void run() {
            for (int i = 0; i < 50; i++) {

                System.out.println("Hii ");
                try {
                    Thread.sleep(7);
                } catch (Exception e) {

                    System.out.println(e.getMessage());
                }

            }
        }
    }

    public static class hello extends Thread {

        public void run() {
            for (int i = 0; i < 50; i++) {

                System.out.println("Hello");
            }
        }
    }
}
