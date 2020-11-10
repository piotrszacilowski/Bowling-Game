import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BowlingGameTest {

    BowlingGame theGame = new BowlingGame();

    @Test
    public void shouldScoreOneWhenRolledOneWithJUnit() {
        assertEquals(1, theGame.getScore());
    }

}
