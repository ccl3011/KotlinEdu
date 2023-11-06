package chap04.section02

fun main() {
    print("Enter the number: ")
    var number = readLine()!!.toInt()
    var factorial: Long = 1

    while (number > 0) { // n xn-1x...x3x2x1
        factorial *= number
        --number
    }

    println("Factorial: $factorial")
}