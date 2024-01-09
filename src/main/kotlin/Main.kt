
val a : String = "I am Kotlin"
val b : String = """Hello,
    How are you?
"""

val c : String = """"$b $a"""



fun main(args: Array<String>) {
    print(a)
    print(b)
    print(c)

}