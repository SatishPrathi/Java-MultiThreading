class JoinThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread: " + i);
        }
    }
}

public class MainJoin {
    public static void main(String[] args) throws InterruptedException {
        JoinThread joinThread = new JoinThread();
        joinThread.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("Main: " + i);
        }

        joinThread.join(); 
        System.out.println("Main thread and JoinThread have finished.");
    }
}
