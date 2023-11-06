package chap02.section03

fun main() {
    var str1 : String? = "Hello Kotlin" //null 허용 (Safe Call)
    var num: Int? = null

    str1 = null
    println("str1: $str1, num: $num")
    println("str1: $str1, length:${str1?.length}")
    //println("str1: $str1, length:${str1!!.length}")  //non-null 단정 기호 null 입력시 NPE 발생

    println("str1: $str1 length: ${str1?.length ?: -1}")  //?: elvis 연산자 사용
}
