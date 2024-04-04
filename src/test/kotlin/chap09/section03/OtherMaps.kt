package chap09.section03

import java.util.SortedMap

fun main(){
    //HashMap
    val hashMap: HashMap<Int, String> = hashMapOf(1 to "Hello",2 to "world")
    println("hashMap = $hashMap")

    //SortedMap
    val sortedMap: SortedMap<Int, String> = sortedMapOf(1 to "Apple", 2 to "Banana")
    println("sortedMap = $sortedMap")

    //LinkedHashMap
    val linkedHash: LinkedHashMap<Int, String> = linkedMapOf(1 to "Computer",2 to "Mouse")
    println("linkedHag: $linkedHash")
}