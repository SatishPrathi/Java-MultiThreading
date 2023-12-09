import java.util.concurrent.*;

public class ScheduleAtFixedRateExample {
    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        ScheduledFuture<?> future = scheduler.scheduleAtFixedRate(() -> {
            System.out.println("Task executed every 3 seconds");
        }, 1, 3, TimeUnit.SECONDS);

        scheduler.schedule(() -> {
            scheduler.shutdown();
        }, 10, TimeUnit.SECONDS);
    }
}
