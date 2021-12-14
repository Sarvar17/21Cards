import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FunctionsTest {

    @Test
    void startGame() {
        Player player = new Player();

        long start = System.currentTimeMillis();
        long end = start + 2000;

        while (System.currentTimeMillis() < end) {
        }

        player.stop();
    }

    @Test
    void printBalance() {
        Player player = new Player();
        assertEquals(0, player.getBalance());
    }

    @Test
    void announceWinner() {
        Player player1 = new Player();
        Player player2 = new Player();
        Math.max(player1.getBalance(), player2.getBalance());
    }
}