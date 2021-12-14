import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheaterTest {

    @Test
    void getBalance() {
        Cheater cheater = new Cheater(new Player());
        assertEquals(0,  cheater.getBalance());
    }
}