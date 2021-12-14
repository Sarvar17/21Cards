import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void getBalance() {
        Player player = new Player();
        assertEquals(0, player.getBalance());
    }

    @Test
    void setBalance() {
        Player player = new Player();
        player.setBalance(100);
        assertEquals(100, player.getBalance());
    }
}