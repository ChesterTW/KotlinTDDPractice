import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*

data class Ticket(val origin :Int, val destination :Int, val price :Int)

fun main() {
    var ticket = Ticket(20,51,420)

    val s = "abcd"
    println(s.validate())
    println((1..30).random())

    val dateTime = LocalDateTime.now()
    println(dateTime.usual())


}

fun String.validate() :Boolean{
    return this.length >= 6
}

fun IntRange.random(): Int {
    return Random().nextInt(endInclusive - start) + start
}

fun LocalDateTime.usual() :String{
    val formatter = DateTimeFormatter.ofPattern("YYYY/MM/dd HH:mm:ss")
    return formatter.format(this)
}