fun makeASound(str: String): String? {
    val soundOfAnimals = mapOf(
        "bear" to "growl",
        "lion" to "roar",
        "monkey" to "chatter",
        "snake" to "hiss",
        "elephant" to "trumpet"
    )
    val sound = if (str in soundOfAnimals) {
        soundOfAnimals[str]
    } else if (str.isEmpty()) {
        "ERROR: You entered an empty string."
    } else {
        "ERROR: Sorry, there is no $str in our zoo."
    }
    return sound
}

fun main() {
    println("Please choose one of the animals in our zoo.")
    val animal = readLine()
    animal?.let {
        println(makeASound(it))
    }
}