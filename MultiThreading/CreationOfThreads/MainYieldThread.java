class YieldThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread: " + i);
            Thread.yield(); 
        }
    }
}

public class MainYieldThread {
    public static void main(String[] args) {
        YieldThread yieldThread = new YieldThread();
        yieldThread.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("Main: " + i);
            Thread.yield(); 
        }
    }
}
