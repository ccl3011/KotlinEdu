package chap04.section01

fun main() {
    val a = 12
    val b = 7

    //블록과 함께 사용
    val max = if(a>b) {
        println("a 선택")
        a //마지막 식인 a가 반환되어 max에 할당
    }
    else {
        println("b 선택")
        b //마지막 식인 b가 반환되어 max에 할당
    }

    println(max)
}