package chap04.section1
class MyClass

fun main() {
    cases("Hello") //② String
    cases(1) //Int
    cases(System.currentTimeMillis()) //Long
    cases(MyClass()) //객체
}

fun cases(obj: Any) { //①
    when (obj) {
        1 -> println("Int: $obj")
        "Hello" -> println("String: $obj")
        is Long -> println("Long: $obj")
        !is String -> println("Not a String")
        else -> println("Unknown")
    }
}