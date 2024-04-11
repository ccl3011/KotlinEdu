package chap10.section01

fun main() {
    data class User(val name: String, var skills: String, var email: String? = null)

    val user = User("Kildong", "default")

    val result = with (user) {
        skills = "Kotlin"
        email = "kildong@example.com"
        //아래 어떠한 반환도 지정하지 않으면 Unit이 반환값에 들어감
        //"success"
    }
    println(user)
    println("result: $result")
}