class Order implements Runnable {
    private int orderId;
    private String restaurantName;
    private int deliveryTime;
    private String deliveryType;

    public Order(int orderId, String restaurantName, int deliveryTime, String deliveryType) {
        this.orderId = orderId;
        this.restaurantName = restaurantName;
        this.deliveryTime = deliveryTime;
        this.deliveryType = deliveryType;
    }

    @Override
    public void run() {
        Thread t = Thread.currentThread();
        long startTime = System.currentTimeMillis();

        try {
            System.out.println("Agent: " + t.getName() +
                    " | Order ID: " + orderId +
                    " | " + restaurantName +
                    " | Type: " + deliveryType +
                    " → Picked Up");

            Thread.sleep(deliveryTime * 1000);

            System.out.println("Agent: " + t.getName() +
                    " | Order ID: " + orderId +
                    " → In Transit");

            Thread.sleep(deliveryTime * 1000);

            System.out.println("Agent: " + t.getName() +
                    " | Order ID: " + orderId +
                    " → Delivered");

        } catch (InterruptedException e) {
            System.out.println("Order interrupted");
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Order " + orderId + " completed in " +
                (endTime - startTime) / 1000 + " seconds\n");
    }
}

public class FoodDeliverySystem {
    public static void main(String[] args) {

        Order o1 = new Order(1, "Dominos", 2, "Express");
        Order o2 = new Order(2, "KFC", 3, "Standard");
        Order o3 = new Order(3, "Pizza Hut", 4, "Economy");
        Order o4 = new Order(4, "Burger King", 2, "Express");
        Order o5 = new Order(5, "McDonalds", 3, "Standard");

        Thread t1 = new Thread(o1, "Agent-1");
        Thread t2 = new Thread(o2, "Agent-2");
        Thread t3 = new Thread(o3, "Agent-3");
        Thread t4 = new Thread(o4, "Agent-4");
        Thread t5 = new Thread(o5, "Agent-5");

        t1.setPriority(Thread.MAX_PRIORITY);   // Express = 10
        t2.setPriority(Thread.NORM_PRIORITY);  // Standard = 5
        t3.setPriority(3);                     // Economy = 3
        t4.setPriority(Thread.MAX_PRIORITY);   // Express = 10
        t5.setPriority(Thread.NORM_PRIORITY);  // Standard = 5

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
