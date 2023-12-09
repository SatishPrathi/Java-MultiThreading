public class AutoSaveDaemonThreadExample {
    public static void main(String[] args) {
        Thread autoSaveThread = new Thread(() -> {
            while (true) {
                System.out.println("Auto-saving...");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        
        autoSaveThread.setDaemon(true);
        
        autoSaveThread.start();
    }
}
