public class CleanupDaemonThreadExample {
    public static void main(String[] args) {
        Thread cleanupThread = new Thread(() -> {
            System.out.println("Cleaning up resources...");
        });
        
        cleanupThread.setDaemon(true);
        
        cleanupThread.start();
        
        
    }
}

