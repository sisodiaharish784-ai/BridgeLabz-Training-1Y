class BankAccountimplimentsRunnable {
    private String accountHolderName;
    private String accountType;

    public BankAccount(String name, String type) {
        this.accountHolderName = name;
        this.accountType = type;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAccountType() {
        return accountType;
    }
}

class UserThread implements Runnable {
    private BankAccount account;

    public UserThread(BankAccount account) {
        this.account = account;
    }

    @Override
    public void run() {
        Thread t = Thread.currentThread();

        for (int i = 1; i <= 3; i++) {
            System.out.println(
                    "User: " + account.getAccountHolderName() +
                            " | Type: " + account.getAccountType() +
                            " | Priority: " + t.getPriority() +
                            " | Checking Balance (" + i + ")"
            );

            try {
                Thread.sleep(2000); // 2 seconds delay
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

public class BankSimulation {
    public static void main(String[] args) {

        BankAccount premium = new BankAccount("Harish", "Premium");
        BankAccount regular = new BankAccount("Amit", "Regular");
        BankAccount basic = new BankAccount("Ravi", "Basic");

        Thread t1 = new Thread(new UserThread(premium));
        Thread t2 = new Thread(new UserThread(regular));
        Thread t3 = new Thread(new UserThread(basic));

        t1.setPriority(Thread.MAX_PRIORITY);   // 10
        t2.setPriority(Thread.NORM_PRIORITY);  // 5
        t3.setPriority(Thread.MIN_PRIORITY);   // 1

        t1.start();
        t2.start();
        t3.start();
    }
}