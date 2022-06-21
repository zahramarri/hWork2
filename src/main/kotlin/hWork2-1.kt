fun sizeOfWord(str: String): String {
    val newStr = str.replace(" ", "")
    val size = if (newStr.length in 1..4) {
        "SHORT"
    } else if (newStr.length in 5..7) {
        "MEDIUM"
    } else if (newStr.length > 7) {
        "LONG"
    } else {
        "ERROR"
    }
    return size
}

fun main() {
    println("Please enter a WORD.")
    val word = readLine()
    word?.let {
        println(sizeOfWord(it))
    }
}