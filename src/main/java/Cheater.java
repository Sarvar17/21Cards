public class Cheater implements Runnable {
    private int balance;
    private boolean exit;
    private Player player;
    private final Thread thread;

    // Constructor for cheater player.
    public Cheater(Player tempPlayer) {
        player = tempPlayer;
        balance = 0;
        exit = false;
        thread = new Thread(this);
        // Starting the thread.
        thread.start();
    }

    // Method run for cheater thread.
    public void run() {
        while(!exit) {
            // Check if cheater will cheat or not.
            if (Functions.isCheat()) { // If yes.
                // Stealing player.
                stealPlayer();

                // Thread sleep.
                try {
                    Thread.sleep(Functions.getTimeOfSleepAfterStealing());
                } catch (InterruptedException e) {
                }
            }
            else { // If no
                // Getting card from the deck.
                balance += Functions.getCard();

                // Thread sleep.
                try {
                    Thread.sleep(Functions.getTimeOfSleep());
                } catch (InterruptedException e) {
                }
            }
        }
    }

    // Method to steal card from balance of player.
    private synchronized void stealPlayer() {
        int steal = Functions.getSteal();
        if (steal <= player.getBalance()) {
            balance += steal;
            player.setBalance(player.getBalance() - steal);
        }
        else {
            balance += player.getBalance();
            player.setBalance(0);
        }
    }

    // Method stop to stop running thread.
    public void stop() {
        exit = true;
    }

    // Method to get balance.
    public int getBalance() {
        return balance;
    }
}
