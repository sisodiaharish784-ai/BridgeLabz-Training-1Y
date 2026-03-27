import java.util.*;

class TicketThread extends Thread {
    private int ticketId;
    private String type;
    private int priority;
    private int queuePosition;
    private static Random rand = new Random();
    private static Map<Integer, List<Long>> stats = new HashMap<>();

    public TicketThread(int ticketId, String type, int priority, int queuePosition) {
        this.ticketId = ticketId;
        this.type = type;
        this.priority = priority;
        this.queuePosition = queuePosition;
        setName("Agent-" + ticketId);
        setPriority(priority);
        stats.putIfAbsent(priority, new ArrayList<>());
    }

    @Override
    public void run() {
        long start = System.currentTimeMillis();

        System.out.println("Start -> Ticket: " + ticketId +
                " | Type: " + type +
                " | Agent: " + getName() +
                " | Priority: " + priority +
                " | Queue Pos: " + queuePosition);

        try {
            int sleepTime = (rand.nextInt(5) + 1) * 1000;
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }

        long end = System.currentTimeMillis();
        long time = (end - start) / 1000;

        synchronized (stats) {
            stats.get(priority).add(time);
        }

        System.out.println("End   -> Ticket: " + ticketId +
                " completed in " + time + " sec");
    }

    public static void printStats() {
        System.out.println("\n--- Statistics ---");
        for (Map.Entry<Integer, List<Long>> entry : stats.entrySet()) {
            int priority = entry.getKey();
            List<Long> times = entry.getValue();

            long sum = 0;
            for (long t : times) sum += t;

            double avg = times.size() > 0 ? (double) sum / times.size() : 0;
            System.out.println("Priority " + priority + " Avg Time: " + avg + " sec");
        }
    }
}

public class TicketSystem {
    public static void main(String[] args) throws InterruptedException {

        List<TicketThread> tickets = new ArrayList<>();

        tickets.add(new TicketThread(1, "Critical Bug", 10, 1));
        tickets.add(new TicketThread(2, "Feature Request", 4, 5));
        tickets.add(new TicketThread(3, "General Query", 2, 7));
        tickets.add(new TicketThread(4, "Feedback", 1, 10));
        tickets.add(new TicketThread(5, "Critical Bug", 10, 2));
        tickets.add(new TicketThread(6, "Feature Request", 4, 6));
        tickets.add(new TicketThread(7, "General Query", 2, 8));
        tickets.add(new TicketThread(8, "Feedback", 1, 9));
        tickets.add(new TicketThread(9, "Critical Bug", 10, 3));
        tickets.add(new TicketThread(10, "General Query", 2, 4));

        long totalStart = System.currentTimeMillis();

        for (TicketThread t : tickets) {
            t.start();
        }

        for (TicketThread t : tickets) {
            t.join();
        }

        long totalEnd = System.currentTimeMillis();

        System.out.println("\nTotal Processing Time: " +
                (totalEnd - totalStart) / 1000 + " sec");

        TicketThread.printStats();
    }
}