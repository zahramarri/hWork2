fun main() {
    var middlePerson = ""
    val takenSeats = mutableListOf<Char>()
    var uSeatIsTaken = false
    val passengersAndSeats = mutableMapOf<Char, String>()
    val seats = mutableSetOf('L', 'R', 'U')
    println("Please enter NAME of 4 passengers and the SEATS they take.")
    for (i in 1..4) {
        val str = readLine().toString()
        if (str.length !in 3..17) {
            println("ERROR: invalid length")
            return
        }
        if (str[str.length - 1] !in seats) {
            println("ERROR: invalid final character")
            return
        }
        if (str[str.length - 2] != ' ') {
            println("ERROR: invalid one character is left to the end")
            return
        }
        for (j in 0 .. str.length - 2) {
            if (str[j].isLowerCase()) {
                println("ERROR: only uppercase")
                return
            }
        }
        if (str[str.length - 1] == 'U') {
            if (uSeatIsTaken) {
                println("ERROR: invalid seat")
                return
            } else {
                uSeatIsTaken = true
            }
        } else if (str[str.length - 1] == 'R') {
            if ('R' in takenSeats) {
                middlePerson = passengersAndSeats['R'].toString()
            } else {
                takenSeats.add('R')
                passengersAndSeats['R'] = str.substring(0..str.length - 2)
            }
        } else if (str[str.length - 1] == 'L') {
            if ('L' in takenSeats) {
                middlePerson = passengersAndSeats['L'].toString()

            } else {
                takenSeats.add('L')
                passengersAndSeats['L'] = str.substring(0..str.length - 2)

            }
        }
    }
    println(middlePerson)
}
