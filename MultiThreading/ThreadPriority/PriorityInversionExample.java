class PriorityInversionExample {
    public static void main(String[] args) {
        Thread highPriorityThread = new Thread(() -> {
            synchronized (PriorityInversionExample.class) {
                for (int i = 0; i < 5; i++) {
                    System.out.println("High Priority Thread - Count: " + i);
                }
            }
        });

        Thread lowPriorityThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Low Priority Thread - Count: " + i);
            }
        });

        highPriorityThread.setPriority(Thread.MAX_PRIORITY);
        lowPriorityThread.setPriority(Thread.MIN_PRIORITY);

        highPriorityThread.start();
        lowPriorityThread.start();
    }
}
