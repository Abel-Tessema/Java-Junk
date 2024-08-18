public class ThreadDemo {
    public static void start() {
        Thread thread = new Thread(() -> System.out.println("Yahallo!"));
        thread.start();
    }
}
