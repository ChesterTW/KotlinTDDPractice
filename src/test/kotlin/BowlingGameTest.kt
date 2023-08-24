import Bowling.BowlingGame
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test


class BowlingGameTest {

    private val bowlingGame = BowlingGame()

    @Test
    fun all_zero(){
        rolls(20, 0)
        val score = bowlingGame.score()
        scoreShouldBe(score)
    }

    private fun scoreShouldBe(score: Any) {
        Assertions.assertEquals(score, bowlingGame.score())
    }

    private fun rolls(rollNumber: Int, pins: Int) {
        for (i in 1..rollNumber) {
            bowlingGame.roll(pins)
        }
    }


}