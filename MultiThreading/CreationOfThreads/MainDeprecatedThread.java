class DeprecatedThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread: " + i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class MainDeprecatedThread {
    public static void main(String[] args) {
        DeprecatedThread deprecatedThread = new DeprecatedThread();
        deprecatedThread.start();

        try {
            Thread.sleep(2000);

            deprecatedThread.suspend();
            System.out.println("Thread suspended");

            Thread.sleep(2000);

            deprecatedThread.resume();
            System.out.println("Thread resumed");

            Thread.sleep(2000);

            deprecatedThread.stop();
            System.out.println("Thread stopped");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
