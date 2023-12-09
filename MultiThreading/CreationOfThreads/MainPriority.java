class PriorityThread extends Thread {
    public void run() {
        System.out.println("Thread Priority: " + Thread.currentThread().getPriority());
    }
}

public class MainPriority {
    public static void main(String[] args) {
        PriorityThread priorityThread = new PriorityThread();
        priorityThread.setPriority(Thread.MAX_PRIORITY); 

        priorityThread.start();

        System.out.println("Main thread priority: " + Thread.currentThread().getPriority());
    }
}
