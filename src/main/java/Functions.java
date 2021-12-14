import java.util.Random;

public class Functions {
    // Method to get card from the deck (from 1 to 10).
    public synchronized static int getCard() {
        Random random = new Random();
        return random.nextInt(10) + 1;
    }

    // Method to know how much cheater can steal (from 0 to 8).
    public synchronized  static int getSteal() {
        Random random = new Random();
        return random.nextInt(9);
    }

    // Method to get time of sleep if player get card from the deck (from 100 to 200).
    public synchronized static int getTimeOfSleep() {
        Random random = new Random();
        return  random.nextInt(101) + 100;
    }

    // Method to get time of sleep if cheater player stole fair player (from 180 to 300).
    public synchronized static int getTimeOfSleepAfterStealing() {
        Random random = new Random();
        return  random.nextInt(121) + 180;
    }

    // Method to know cheater player will cheat or no.
    public synchronized static boolean isCheat() {
        // We hit the 0.4 ( 40% ) case.
        return new Random().nextDouble() <= 0.4;
    }

    // Method to start our game.
    public static void startGame(Player firstPlayer, Cheater secondPlayer, Cheater thirdPlayer) {
        // Initializing current time and time when 10 seconds pasts.
        long start = System.currentTimeMillis();
        long end = start + 10*1000;
        System.out.println("The game started! (will end in 10 seconds)");
        // While loop to check if 10 seconds pasts.
        while (System.currentTimeMillis() < end) {
        }

        // Stopping players.
        firstPlayer.stop();
        secondPlayer.stop();
        thirdPlayer.stop();

        // Announcing that game is over.
        System.out.println("The game ended!");
    }

    // Method to print to the console balances of players.
    public static void printBalance(Player firstPlayer, Cheater secondPlayer, Cheater thirdPlayer) {
        System.out.println("Balance of first player: " + firstPlayer.getBalance());
        System.out.println("Balance of second player: " + secondPlayer.getBalance());
        System.out.println("Balance of third player: " + thirdPlayer.getBalance());
    }

    // Method to announce winner(s) of the game.
    public static void announceWinner(Player firstPlayer, Cheater secondPlayer, Cheater thirdPlayer) {
        int maxBalance = Math.max(firstPlayer.getBalance(), Math.max(secondPlayer.getBalance(), thirdPlayer.getBalance()));
        System.out.println("Winner winner chicken dinner:");
        if (firstPlayer.getBalance() == maxBalance) {
            System.out.println("The 1st player");
        }
        if (secondPlayer.getBalance() == maxBalance) {
            System.out.println("The 2nd player");
        }
        if (thirdPlayer.getBalance() == maxBalance) {
            System.out.println("The 3rd player");
        }
        System.out.println("Congrats!!");
    }
}
