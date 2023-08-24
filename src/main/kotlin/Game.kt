import java.util.Random
import java.util.Scanner

fun main() {

    val secret = Random().nextInt(10)+1
    println(secret)

//    val scanner = Scanner(System.`in`)
    var number = 0

    while (number != secret){
        print("Please enter a number: ")
        number = readln().toInt()
//        number = scanner.nextInt()
        if(number < secret){
            println("Higher")
        } else if(number > secret){
            println("Lower")
        } else{
            println("Great, the number is $number")
        }
    }


}