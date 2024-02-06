
val a : String = "I am Kotlin\n"
val b : String = """Hello,
    How are you?
"""

var  name : String = ""

val c : String = """"$b $a"""

var inevestment = 500
var profit = 100
var luke : String = "Luke is running out of battery!"

fun main(args: Array<String>) {
    print(a)
    print(b)
    print(c)

    val 

      name  = "SRK"

    print("\nTotal money:"+(inevestment+profit))

    lukespeaks(luke)

    checkwhen(120)

}

fun lukespeaks(speak : String){
    println("$speak")

}


fun checkwhen(price : Int){
    when(price){
        100 -> println("This is cheaper")
        1000 -> println("This is costly")

        else -> print("Beyond the budget!!!!")
    }
}