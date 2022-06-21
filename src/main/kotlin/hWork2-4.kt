class Calculator {
    private var memory = 0.0
    fun addition(num1: Double, num2: Double): Double {
        memory = num1 + num2
        return memory
    }

    fun addition(num: Double): Double {
        memory += num
        return memory
    }

    fun subtraction(num1: Double, num2: Double): Double {
        memory = num1 - num2
        return memory
    }

    fun subtraction(num: Double): Double {
        memory -= num
        return memory
    }

    fun multiplication(num1: Double, num2: Double): Double {
        memory = num1 * num2
        return memory
    }

    fun multiplication(num: Double): Double {
        memory *= num
        return memory
    }

    fun division(num1: Double, num2: Double): Double {
        memory = num1 / num2
        return memory
    }

    fun division(num: Double): Double {
        memory /= num
        return memory
    }

    fun resetMemory() {
        memory = 0.0
    }
}

fun main() {
    val myCalculator = Calculator()
    val signs = arrayOf('+', '-', '*', '/')
    val validCharacters = arrayOf('0', '1', '2', '3', '4', '5', '6', '7', '8', '9')
    while (true) {
        println("Please enter your instruction.")
        val input = readLine()
        input?.let {
            when (it) {
                "exit" -> {
                    return
                }
                "reset" -> {
                    myCalculator.resetMemory()
                }
                else -> {
                    val inputWithoutWS = it.replace(" ", "")
                    for (char in inputWithoutWS) {
                        if (char !in signs && char !in validCharacters) {
                            println("ERROR: invalid character")
                        } else {
                            if (inputWithoutWS[0] in validCharacters) {
                                when (char) {
                                    '+' -> {
                                        val numbers = inputWithoutWS.split(char)
                                        val result = myCalculator.addition(numbers[0].toDouble(), numbers[1].toDouble())
                                        println(result)
                                    }
                                    '-' -> {
                                        val numbers = inputWithoutWS.split(char)
                                        val result = myCalculator.subtraction(numbers[0].toDouble(), numbers[1].toDouble())
                                        println(result)
                                    }
                                    '*' -> {
                                        val numbers = inputWithoutWS.split(char)
                                        val result = myCalculator.multiplication(numbers[0].toDouble(), numbers[1].toDouble())
                                        println(result)
                                    }
                                    '/' -> {
                                        val numbers = inputWithoutWS.split(char)
                                        val result = myCalculator.division(numbers[0].toDouble(), numbers[1].toDouble())
                                        println(result)
                                    }
                                }
                            } else {
                                when (char) {
                                    '+' -> {
                                        val number = inputWithoutWS.substring(1 until inputWithoutWS.length)
                                        val result = myCalculator.addition(number.toDouble())
                                        println(result)
                                    }
                                    '-' -> {
                                        val number = inputWithoutWS.substring(1 until inputWithoutWS.length)
                                        val result = myCalculator.subtraction(number.toDouble())
                                        println(result)
                                    }
                                    '*' -> {
                                        val number = inputWithoutWS.substring(1 until inputWithoutWS.length)
                                        val result = myCalculator.multiplication(number.toDouble())
                                        println(result)
                                    }
                                    '/' -> {
                                        val number = inputWithoutWS.substring(1 until inputWithoutWS.length)
                                        val result = myCalculator.division(number.toDouble())
                                        println(result)
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}