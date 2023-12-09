import java.util.concurrent.*;

public class ScheduleWithFixedDelayExample {
    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        ScheduledFuture<?> future = scheduler.scheduleWithFixedDelay(() -> {
            System.out.println("Task executed with a fixed delay of 3 seconds");
        }, 1, 3, TimeUnit.SECONDS);

        scheduler.schedule(() -> {
            scheduler.shutdown();
        }, 10, TimeUnit.SECONDS);
    }
}
