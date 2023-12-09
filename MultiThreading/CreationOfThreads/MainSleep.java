class SleepThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class MainSleep {
    public static void main(String[] args) {
        SleepThread sleepThread = new SleepThread();
        sleepThread.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("Main: " + i);
        }
    }
}
