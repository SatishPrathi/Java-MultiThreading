import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPoolExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 5; i++) {
            Runnable task = new MyRunnable(i);
            executor.submit(task);
        }

        executor.shutdown();
    }
}

class MyRunnable implements Runnable {
    private final int taskId;

    public MyRunnable(int taskId) {
        this.taskId = taskId;
    }

    public void run() {
        System.out.println("Task " + taskId + " is being executed by thread " + Thread.currentThread().getName());
    }
}
