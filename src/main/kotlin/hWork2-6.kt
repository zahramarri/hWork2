fun main() {
    var numberOfStars = 0
    val inSky = arrayOf('o', '.', '*')
    println("Please enter m and n.")
    val input1 = readLine().toString().replace(" ", "").toInt()
    val m = input1 / 10
    val n = input1 % 10
    if (m in 1..100 && n in 1..100) {
        println("Please fill in the sky!")
        for (i in 1..n) {
            val input2 = readLine().toString()
            if (input2.length != m) {
                println("ERROR: invalid length.")
            } else {
                for (char in input2) {
                    if (char !in inSky) {
                        println("ERROR: invalid character.")
                    } else if (char == '*') {
                        numberOfStars++
                    }
                }
            }
        }
        println(numberOfStars)
    } else {
        println("ERROR: invalid number")
    }
}