fun main(args: Array<String>) {

    val p = Human("Taro",74.5f,1.7f)
    // println(p.bmi())

//    p.hello()
//
//    var dog = Dog()
//    dog.eat()

    fun truncateString(input:String,maxLength:Int):String{

        var output: String
        if (input.length == maxLength){
            output = input.substring(0 until maxLength-1)
        } else {
            output = input.substring(0 until maxLength) + "..."
        }

        return output
    }

    println(truncateString("今天的天氣",3))



}

class Human (private var weight : Float, private var height : Float){
    constructor(name:String, weight: Float, height: Float) : this(weight,height)
    fun bmi(): Float {

        return weight / (height * height);
    }

    fun hello(){
        println("Hello")
    }
}

abstract class Animal(){
    abstract fun eat()
}

class Dog() :Animal() {
    override fun eat() {
        println("咬骨頭")
    }

}