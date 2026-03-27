class ExamActivity implements Runnable {
    private String activityName;
    private int startDelay;
    private int workTime;

    public ExamActivity(String activityName, int startDelay, int workTime) {
        this.activityName = activityName;
        this.startDelay = startDelay;
        this.workTime = workTime;
    }

    @Override
    public void run() {
        Thread t = Thread.currentThread();

        try {
            System.out.println(activityName + " Thread State: " + t.getState());

            Thread.sleep(startDelay);

            System.out.println(activityName + " Started | State: " + t.getState());

            Thread.sleep(workTime);

            System.out.println(activityName + " Completed | State: " + t.getState());

        } catch (InterruptedException e) {
            System.out.println(activityName + " Interrupted");
        }
    }
}

public class ExamHallManagement {
    public static void main(String[] args) {

        ExamActivity entry = new ExamActivity("Student Entry Monitoring", 0, 8000);
        ExamActivity question = new ExamActivity("Question Paper Distribution", 5000, 3000);
        ExamActivity attendance = new ExamActivity("Attendance Marking", 10000, 3000);
        ExamActivity collection = new ExamActivity("Answer Sheet Collection", 15000, 3000);

        Thread t1 = new Thread(entry);
        Thread t2 = new Thread(question);
        Thread t3 = new Thread(attendance);
        Thread t4 = new Thread(collection);

        t1.setPriority(Thread.NORM_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(8);
        t4.setPriority(7);

        System.out.println("Before Start:");
        System.out.println("Entry: " + t1.getState());
        System.out.println("Question: " + t2.getState());
        System.out.println("Attendance: " + t3.getState());
        System.out.println("Collection: " + t4.getState());

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        try {
            while (t1.isAlive() || t2.isAlive() || t3.isAlive() || t4.isAlive()) {
                System.out.println("\nThread States:");
                System.out.println("Entry: " + t1.getState());
                System.out.println("Question: " + t2.getState());
                System.out.println("Attendance: " + t3.getState());
                System.out.println("Collection: " + t4.getState());

                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        System.out.println("\nAll activities completed. Exam finished.");
    }
}
