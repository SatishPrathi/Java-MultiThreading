class IdThread extends Thread {
    public void run() {
        System.out.println("Thread ID: " + Thread.currentThread().getId());
    }
}

public class MainID {
    public static void main(String[] args) {
        IdThread idThread = new IdThread();
        idThread.start();
    }
}
