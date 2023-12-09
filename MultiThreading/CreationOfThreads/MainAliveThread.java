class AliveThread extends Thread {
    public void run() {
        System.out.println("Thread is alive: " + Thread.currentThread().isAlive());
    }
}

public class MainAliveThread {
    public static void main(String[] args) {
        AliveThread aliveThread = new AliveThread();
        System.out.println("Before starting thread: " + aliveThread.isAlive());

        aliveThread.start();

        try {
            aliveThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("After thread completion: " + aliveThread.isAlive());
    }
}
