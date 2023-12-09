public class CurrentThreadExample {
    public static void main(String[] args) {
        Thread currentThread = Thread.currentThread();
        System.out.println("Current Thread: " + currentThread.getName());
    }
}
