package chap04.section03

fun main() {
    retFunc()
}

//inline fun inlineLambda(a: Int, b: Int, out: (Int, Int) -> Unit) { //@inlineLambda 사용시 inline 포함
fun inlineLambda(a: Int, b: Int, out: (Int, Int) -> Unit) { //@lit 사용시 inline 제거
    out(a,b)
}

fun retFunc() {
    println("start of retFunc")
    inlineLambda(13,3) lit@{ a,b -> // ①람다식 블록의 시작 부분에 라벨을 지정함
        val result = a + b
        if(result > 10) return@lit // ②라벨을 사용한 블록의 끝부분으로 반환 -> 암묵적 라벨 @inlineLambda
        println("result: $result")
        // ③여기로 이동
    }
    println("end of retFunc") // ④이 부분이 실행됨
}

fun retFunc2() {
    println("start of retFunc")
    inlineLambda(13,3, fun (a,b) {
        val result = a + b
        if(result > 10) return
        println("result: $result")
    }) //inlineLambda()함수의 끝
    println("end of retFunc")
}