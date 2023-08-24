import java.time.LocalDateTime
import kotlin.math.ceil


fun main() {
    //originalTest()

    // Create Parking
    val parkingLot : MutableMap<String, Car?> = mutableMapOf()

    // Create Car
    val enter = LocalDateTime.of(2023, 7 ,19,8,30,0)
    val leave = LocalDateTime.of(2023,7,19,18,0,0)
    var car:Car? = Car("MRL-0916", enter)

    // First Car Enter
    parkingLot[car!!.id] = car

    // Second Car Enter
    car = Car("MUD-6142", enter.plusMinutes(30))
    parkingLot[car.id] = car

    // First Car Leave
    car = parkingLot["MRL-0916"]
    car?.leave = leave
    parkingLot.remove(car?.id)
    println("id: ${car?.id}\tDuration: ${car!!.duration()}\tremain: ${parkingLot.size}\tcost: ${ceil(car.duration()/60.0).toLong()*30}")


    // Second Car Leave
    car = parkingLot["MUD-6142"]
    car?.leave =leave.plusHours(1)
    parkingLot.remove(car?.id)
    println("id: ${car?.id}\tDuration: ${car!!.duration()}\tremain: ${parkingLot.size}\tcost: ${ceil(car.duration()/60.0).toLong()*30}")

}

private fun originalTest() {
    val enter = LocalDateTime.of(2023, 7, 18, 9, 0)
    val leave = LocalDateTime.of(2023, 7, 18, 12, 30)

    val car = Car("MRL-0916", enter)
    car.leave = leave
    println(car.duration())

    val hours = ceil(car.duration() / 60.0).toLong()
    println(hours)
}

class Car(val id: String, private val enter: LocalDateTime ){
    var leave: LocalDateTime? = null
        set(value) {
            if(enter.isBefore(value)){
                field = value;
            }
        }

    fun duration() = java.time.Duration.between(enter,leave).toMinutes()


}