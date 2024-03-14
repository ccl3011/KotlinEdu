package chap07.section02

//실드 클래스는 상태를 정의하고 관리하는데 주로 사용
sealed class Result {
    open class Success(val message: String): Result()
    class Error(val code: Int, val message: String): Result()
}

fun main() {
    val result = Result.Error(10, "No disk")
    println(eval(result))
}

//상태를 검사하기 위한 함수
fun eval(result: Result): String = when(result) {
    is Result.Success -> result.message
    is Result.Error -> result.message
    //모든 조건을 가지므로 else가 필요 없음
}