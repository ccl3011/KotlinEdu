package chap09.section02

import java.util.TreeSet

fun main(){
    val intsSortedSet: TreeSet<Int> = sortedSetOf(4,1,7,2)
    intsSortedSet.add(6)
    intsSortedSet.remove(1)
    println("intsSortedSet = $intsSortedSet")
    intsSortedSet.clear()
    println("intsSortedSet = $intsSortedSet")
}