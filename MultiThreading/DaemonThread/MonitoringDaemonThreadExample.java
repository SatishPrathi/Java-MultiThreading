public class MonitoringDaemonThreadExample {
    public static void main(String[] args) {
        Thread monitorThread = new Thread(() -> {
            while (true) {
                System.out.println("Monitoring system...");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        
        monitorThread.setDaemon(true);
        
        monitorThread.start();
        
        
    }
}
