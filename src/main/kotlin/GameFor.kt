import java.util.Random
import java.util.Scanner


fun main() {

    val secret = Random().nextInt(10)+1
    println(secret)
    val scanner = Scanner(System.`in`)

     for (i in 1..4){
         print("Please enter a number($i/4): ")
         val number = scanner.nextInt();
         println("第 $i 次：${number}")

         if(number < secret){
             println("higher")
         } else if(number > secret){
             println("lower")
         } else{
             println("Great, number is $number")
             break;
         }

     }

}