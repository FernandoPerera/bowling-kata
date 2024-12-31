import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerShould {

    @Test
    void get_the_score_after_the_end_of_the_turnover() {
        Player player = new Player();
        int expectedScore = 7;

        player.roll(3);
        player.roll(4);

        assertEquals(expectedScore, player.score());
    }

    @Test
    void not_update_the_score_before_the_end_of_the_turnover() {
        Player player = new Player();
        int expectedScore = 0;

        player.roll(3);

        assertEquals(expectedScore, player.score());
    }

}