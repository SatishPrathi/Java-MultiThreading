class StateThread extends Thread {
    public void run() {
        System.out.println("Thread State: " + Thread.currentThread().getState());
    }
}

public class MainState {
    public static void main(String[] args) {
        StateThread stateThread = new StateThread();
        stateThread.start();

        System.out.println("Main thread state: " + Thread.currentThread().getState());
    }
}
