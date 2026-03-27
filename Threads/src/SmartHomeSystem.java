import java.time.LocalTime;

class Device implements Runnable {
    private String deviceName;
    private int interval;

    public Device(String deviceName, int interval) {
        this.deviceName = deviceName;
        this.interval = interval;
    }

    @Override
    public void run() {
        Thread t = Thread.currentThread();

        for (int i = 1; i <= 5; i++) {
            System.out.println(
                    "[" + LocalTime.now() + "] " +
                            deviceName +
                            " | Priority: " + t.getPriority() +
                            " | Cycle: " + i
            );

            try {
                Thread.sleep(interval);
            } catch (InterruptedException e) {
                System.out.println(deviceName + " interrupted");
            }
        }

        System.out.println(deviceName + " finished execution.");
    }
}

public class SmartHomeSystem {
    public static void main(String[] args) {

        Device tempSensor = new Device("Temperature Sensor", 5000);
        Device securityCam = new Device("Security Camera", 3000);
        Device lightCtrl = new Device("Light Controller", 4000);
        Device doorLock = new Device("Door Lock Monitor", 6000);

        Thread t1 = new Thread(tempSensor);
        Thread t2 = new Thread(securityCam);
        Thread t3 = new Thread(lightCtrl);
        Thread t4 = new Thread(doorLock);

        t1.setPriority(7);                      // Temperature
        t2.setPriority(Thread.MAX_PRIORITY);    // Security = 10
        t3.setPriority(Thread.NORM_PRIORITY);   // Light = 5
        t4.setPriority(Thread.NORM_PRIORITY);   // Door = 5

        t1.start();
        t2.start();
        t3.start();
        t4.start();


        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        System.out.println("\nAll devices completed. Smart Home System shutting down.");
    }
}