package tdd.ox;

import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class RefereeTest {

    private Referee ref = new Referee();

    @Test
    public void horizontalRowOfNaughts_NaughtWins() {
        //given
        String plansza = "OOO";

        //when - then
        assertTrue(ref.didOWon(plansza));
    }

    @Test
    public void verticalRowOfNaughts_NaughtWins() {
        //given
        String plansza = "O\nO\nO\n";

        //when - then
        assertTrue(ref.didOWon(plansza));
    }

    @Test
    public void verticalRowOfCrosses_NaughtCannotWins() {
        //given
        String plansza = "X\nX\nX\n";

        //when - then
        assertFalse(ref.didOWon(plansza));
    }

}