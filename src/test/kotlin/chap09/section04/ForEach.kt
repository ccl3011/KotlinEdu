package chap09.section04

fun main(){
    val list = listOf(1,2,3,4,5,6)
    val map = mapOf(11 to "Java", 22 to "Kotlin", 33 to "C++")

    //forEach 각 요소를 람다식으로 처리
    list.forEach {print("$it ") }
    println()
    list.forEachIndexed { index, value -> println("index[$index]: $value") } //인덱스 포함

    println("-------------------------------------------")

    //onEach 각 요소를 람다식으로 처리 후 컬렉션으로 반환
    val returnedList = list.onEach { print(it) }
    println()
    val returnedMap = map.onEach { println("key: ${it.key}, value: ${it.value}") }
    println("returnedList = $returnedList")
    println("returnedMap = $returnedMap")
}