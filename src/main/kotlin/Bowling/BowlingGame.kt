package Bowling

class BowlingGame {
    private var list = mutableListOf<Int>()
    fun roll(pins: Int) {
        list.add(pins)
    }

    fun score(): Int {
        var score = 0
        var rollIndex = 0
        for (i in 1 .. 10){
            if(rollIndex>0){
                when{
                    list[rollIndex-1] + list[rollIndex-2] == 10 -> {
                        score += list[rollIndex]
                    }
                }
            }
            score += list[rollIndex] + list[rollIndex+1]
            rollIndex += 2
        }

        return score
    }
}