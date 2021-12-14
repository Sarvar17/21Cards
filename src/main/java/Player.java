public class Player implements Runnable {
    private int balance;
    private boolean exit;
    private final Thread thread;

    // Constructor for fair player.
    public Player() {
        balance = 0;
        exit = false;
        thread = new Thread(this);
        // Starting the thread.
        thread.start();
    }

    // Method run for thread.
    public void run() {
        while(!exit) {
            balance += Functions.getCard();
            try {
                Thread.sleep(Functions.getTimeOfSleep());
            } catch (InterruptedException e) {
            }
        }
    }

    // Method stop to stop running thread.
    public void stop() {
        exit = true;
    }

    // Method to get balance of player.
    public int getBalance() {
        return balance;
    }

    // Method to set balance of player.
    public void setBalance(int value) {
        balance = value;
    }
}
