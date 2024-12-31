import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PlayerShould {

    private Player player;

    @BeforeEach
    void setUp() {
        player = new Player();
    }

    @Test
    void get_the_score_after_the_end_of_the_turnover() {
        int expectedScore = 7;

        player.roll(3);
        player.roll(4);

        assertEquals(expectedScore, player.score());
    }

    @Test
    void not_update_the_score_before_the_end_of_the_turnover() {
        int expectedScore = 0;

        player.roll(3);

        assertEquals(expectedScore, player.score());
    }

    @Test
    void not_update_the_score_when_it_achieves_a_spare() {
        int expectedScore = 0;

        player.roll(3);
        player.roll(7);

        assertEquals(expectedScore, player.score());
    }

}