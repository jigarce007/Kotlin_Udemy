fun main() {
    val originalString = "xxxyxzxxx"
    val transformedString = transformString(originalString)
    println(transformedString)
}

fun transformString(input: String): String {
    // Replace consecutive occurrences of 'x' with a single 'x'
    val transformedString = input.replace(Regex("xx+"), "xx")
    return transformedString
}