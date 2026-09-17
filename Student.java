class ExamTask implements Runnable {
    private String activity;
    private int delay;

    public ExamTask(String activity, int delay) {
        this.activity = activity;
        this.delay = delay;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 3; i++) {
                System.out.println(Thread.currentThread().getName() + " -> " + activity);
                Thread.sleep(delay);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new ExamTask("Displaying remaining time", 1000));
        Thread t2 = new Thread(new ExamTask("Auto-saving answers", 2000));
        Thread t3 = new Thread(new ExamTask("Checking network connection", 3000));

        t1.setName("TimerThread");
        t2.setName("AutoSaveThread");
        t3.setName("NetworkThread");

        t1.start();
        t2.start();
        t3.start();
    }
}
