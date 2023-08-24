fun main() {
    val list = listOf(8,9,1,4)
    println(list)

    for (i in list){
        print("$i\t")
    }
    println()

    val mutableList = mutableListOf(2,3,6,1)
    for (i in mutableList){
        print("$i\t")
    }
}