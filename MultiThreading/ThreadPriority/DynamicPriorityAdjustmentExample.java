class DynamicPriorityAdjustmentExample {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " - Count: " + i);
            }
        }, "Dynamic Priority Thread");

        thread.setPriority(Thread.NORM_PRIORITY);

        thread.start();

        try {
            Thread.sleep(2000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread.setPriority(Thread.MAX_PRIORITY);
    }
}
