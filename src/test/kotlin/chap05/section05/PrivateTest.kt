package chap05.section05

/**
 * 가시성 지시자의 공개 범위 *
 * Base 클래스 내 : private
 * Derived 클래스 내(Outer 클래스 제외) : protected
 * 모듈 패키지 내 : internal
 * 다른 모듈까지 : public
 * */
private class PrivateClass {
    private var i = 1
    private fun privateFunc() {
        i += 1 //접근 허용
    }
    fun access() { //public
        privateFunc() //접근 허용
    }
}

class OtherClass {
    //val opc = PrivateClass() //불가 - 프로퍼티 opc는 private이 되야 함
    fun test() {
        val pc = PrivateClass() //생성 가능
    }
}

fun main() {
    val pc = PrivateClass() //생성 가능
    //pc.i //접근 불가
    //pc.privateFunc() //접근 불가
}

fun topFunction() {
    val tpc = PrivateClass() //객체 생성 가능
}