package chap09.section04

fun main(){
    //단순 메서드 체이닝을 사용할 때
    val list1 = listOf(1,2,3,4,5)
    val listDefault = list1
        .map { println("map($it) "); it*it }
        .filter { println("filter($it) "); it % 2==0 }
    println(listDefault)
}