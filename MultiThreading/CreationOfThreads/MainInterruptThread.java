class InterruptThread extends Thread {
    public void run() {
        try {
            Thread.sleep(2000); 
            System.out.println("Thread woke up");
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
}

public class MainInterruptThread {
    public static void main(String[] args) {
        InterruptThread interruptThread = new InterruptThread();
        interruptThread.start();

        interruptThread.interrupt(); 
    }
}
