package chap03.section03

fun sum(a: Int, b:Int) = a+b
fun mul(a: Int, b:Int) = a*b

fun main() {

    val result = sum(10,3)
    val result2 = mul(sum(3,3),2)

    println("result: $result, result2: $result2")
    println(funcFunc())
}

fun funcFunc(): Int {

    return sum(2,2)
}

