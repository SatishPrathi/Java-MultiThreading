class NameThread extends Thread {
    public void run() {
        System.out.println("Thread Name: " + Thread.currentThread().getName());
    }
}

public class MainName {
    public static void main(String[] args) {
        NameThread nameThread = new NameThread();
        nameThread.setName("CustomThreadName");

        nameThread.start();

        System.out.println("Main thread name: " + Thread.currentThread().getName());
    }
}
