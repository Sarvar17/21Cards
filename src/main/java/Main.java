public class Main {
    public static void main(String[] args) {
        // Initializing one fair and two cheater players.
        Player firstPlayer = new Player();
        Cheater secondPlayer = new Cheater(firstPlayer);
        Cheater thirdPlayer = new Cheater(firstPlayer);

        // Starting game.
        Functions.startGame(firstPlayer, secondPlayer, thirdPlayer);

        // Printing balances of players.
        Functions.printBalance(firstPlayer, secondPlayer, thirdPlayer);

        // Announcing winner.
        Functions.announceWinner(firstPlayer, secondPlayer, thirdPlayer);
    }
}
