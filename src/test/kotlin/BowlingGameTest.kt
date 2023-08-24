import Bowling.BowlingGame
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test


class BowlingGameTest {

    private val bowlingGame = BowlingGame()

    @Test
    fun all_zero(){
        rolls(20, 0)
        scoreShouldBe(0)
    }

    @Test
    fun all_three(){
        rolls(20, 3)
        scoreShouldBe(60)
    }

    @Test
    fun one_spare(){
        rolls(1, 3)
        rolls(1, 7)
        rolls(18, 3)
        scoreShouldBe(67)
    }

    private fun scoreShouldBe(score: Int) {
        Assertions.assertEquals(score, bowlingGame.score())
    }

    private fun rolls(rollNumber: Int, pins: Int) {
        for (i in 1..rollNumber) {
            bowlingGame.roll(pins)
        }
    }


}