package chap09.section02

fun main() {
    val mixedTypeSet = setOf("Hello", 5, "world", 3.14,'c')
    var intSet: Set<Int> = setOf<Int>(1,5,5) //정수형만 초기화

    println(mixedTypeSet)
    println(intSet) //[1,5]
}