import Bowling.BowlingGame
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test


class BowlingGameTest {


    @Test
    fun all_zero(){
        val bowlingGame = BowlingGame()
        for (i in 1..20){
            bowlingGame.roll(0)
        }
        val score = bowlingGame.score()
        Assertions.assertEquals(0,score)
    }




}