package chap08.section02

import java.util.*

fun main() {
    //Any 모든 자료형 Number 실수
    val b = Array<Any>(10, {0}) //[0,..,0]

    b[0] = "Hello World"
    b[1] = 1.1

    println(Arrays.toString(b))
}