package chap09.section01

fun main() {
    //가변형 List를 생성하고 자바의 ArrayList로 반환
    val stringList: ArrayList<String> = arrayListOf<String>("Hello","Kotlin")
    stringList.add(("Java"))
    stringList.remove("Hello")
    println(stringList)
}