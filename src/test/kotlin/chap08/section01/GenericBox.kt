package chap08.section01

class Box<T>(a: T) {
    var name = a
}

fun main() {
    //val box1 = Box(1) //ctrl + Shift + p 형식 매개변수 추론 가능
    val box1: Box<Int> = Box<Int>(1)
    val box2: Box<String> = Box<String>("Hello")

    println(box1.name)
    println(box2.name)
}