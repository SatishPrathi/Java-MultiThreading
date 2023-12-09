public class LoggingDaemonThreadExample {
    public static void main(String[] args) {
        Thread loggerThread = new Thread(() -> {
            while (true) {
                System.out.println("Logging: " + System.currentTimeMillis());
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        
        loggerThread.setDaemon(true);
        
        loggerThread.start();
        
        
    }
}
