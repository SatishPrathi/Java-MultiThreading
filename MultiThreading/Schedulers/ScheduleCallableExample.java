import java.util.concurrent.*;

public class ScheduleCallableExample {
    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        ScheduledFuture<String> future = scheduler.schedule(() -> {
            System.out.println("Callable task executed after 2 seconds");
            return "Task Result";
        }, 2, TimeUnit.SECONDS);

        try {
            String result = future.get(); 
            System.out.println("Result: " + result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        scheduler.shutdown();
    }
}
