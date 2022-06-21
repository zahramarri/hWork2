import java.util.regex.Pattern

fun repeatInString(str1: String, str2: String): Int? {
    var repeat: Int? = 0
    if (str2.length <= str1.length) {
        var i = 0
        while (i < str1.length - 1) {
            if (str2[0] == str1[i]) {
                var j = 0
                while (j + 1 < str2.length && i + 1 < str1.length) {
                    if (str1[i + 1] == str2[j + 1]) {
                        j++
                        i++
                    } else {
                        break
                    }
                }
                if (j == str2.length - 1) {
                    repeat = repeat!! + 1
                } else {
                    i++
                }
            } else {
                i++
            }
        }
    } else {
        println("ERROR: The second string must be shorter.")
        repeat = null
    }
    return repeat
}

// second solution
//fun repeatInString(s1: String, s2: String): Int {
//    var count = 0
//    var s3 = s1
//    var last = s3.lastIndexOf(s2)
//    while (last != -1) {
//        count++
//        s3 = s3.subSequence(0, last).toString()
//        last = s3.lastIndexOf(s2)
//    }
//    return count
//}

// third solution
//fun repeatInString (s1: String, s2: String): Int {
//    val b = Pattern.compile(s2).matcher(s1)
//    var repeat = 0
//    while (b.find()){
//        repeat++
//    }
//    return repeat
//}

//forth solution
//fun repeatInString (s1: String, s2: String): Int {
//    val s = s1.replace(s2, "")
//    val repeat = (s1.length - s.length) / s2.length
//    return repeat
//}


fun main() {
    println("Please enter TWO STRINGS.")
    val str1 = readLine()
    val str2 = readLine()
    str1?.let {
        str2?.let {
            println(repeatInString(str1, str2))
        }
    }
}