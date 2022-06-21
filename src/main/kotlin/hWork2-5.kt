fun main() {
    val orderedLampNumbers = mutableListOf<Int>()
    val turnedOffLampIndices = mutableListOf<Int>()
    println("Please enter n.")
    val n = readLine().toString().toInt()
    if (n in 1..100000) {
        println("Please enter n numbers in range 1 to n.")
        val lampNumbers = readLine().toString().split(" ")
        if (lampNumbers.size == n) {
            for (lampNumber in lampNumbers) {
                if (lampNumber.toInt() !in 1..n) {
                    println("ERROR: invalid lamp number")
                    return
                }
            }
            println("Please enter the state of each lamp")
            val stateOfLamps = readLine().toString().split(" ")
            if (stateOfLamps.size == n) {
                for ((index, state) in stateOfLamps.withIndex()) {
                    if (state == "1") {
                        turnedOffLampIndices.add(index)
                    }
                }
                for (index in turnedOffLampIndices) {
                    var min = index
                    var i = 1
                    while (i < turnedOffLampIndices.size) {
                        if (turnedOffLampIndices[i] < min) {
                            min = turnedOffLampIndices[i]
                        }
                        i++
                    }
                    orderedLampNumbers.add(min)
                }
                println(orderedLampNumbers.toString())
            } else {
                println("ERROR: not n states!")
            }
        } else {
          println("ERROR: not n numbers!")
        }
    } else {
        println("ERROR: invalid number")
    }

}