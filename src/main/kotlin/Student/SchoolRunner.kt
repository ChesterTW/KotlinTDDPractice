package Student

import java.util.Scanner

fun main() {

    //userInput()

    // Companion(Static) Modify
    Student.pass = 50

    var std = Student("Taro", 30, 89)
    var std1 = Student("Soda", 36, 80)
    var std2 = Student("Erika", 56, 77)
    std.print()
    std1.print()
    std2.print()
//    println("Highest Score: ${std.highest()}")

    var std3 = GraduateStudent("Kiwi", 60,60,60)
    std3.print()


}

private fun userInput() {
    val scanner = Scanner(System.`in`)
    print("Please Enter Student's Name: ")
    var name = scanner.next()
    print("Please Enter Student's English: ")
    var english = scanner.nextInt()
    print("Please Enter Student's Math: ")
    var math = scanner.nextInt()

    val stu = Student(name, english, math)
    stu.print()
}

open class Student(var name : String, var english : Int, var math : Int){
    companion object{
        @JvmStatic
        var pass = 60
    }

    open fun print(){
        println("$name\t$english\t$math\t${getAverage()}\t${passOrFailed()}\t${grading()}")
    }

    fun grading() = when(getAverage()){
        in 90..100 -> 'A'
        in 80..89 -> 'B'
        in 70..79 -> 'C'
        in 60..69 -> 'D'
        else -> 'F'
    }

    open fun passOrFailed() = if(getAverage() >= pass) "PASS" else "FAILED"

    fun highest() = if(english > math) {
        english
    } else {
        math
    }

    fun getAverage() = (english+math)/2
}

class GraduateStudent(name: String,english: Int,math: Int,var thesis: Int) : Student(name,english,math){
    companion object{
        var pass = 70
    }

    override fun print() {
        println("$name\t$english\t$math\t$thesis\t${getAverage()}\t${passOrFailed()}\t${grading()}")
    }

    override fun passOrFailed() = if(getAverage () >= pass) "PASS" else "FAILED"
}