package chap06.section01

class User3(_id: Int, _name: String, _age: Int) {
    val id: Int = _id
    private var tempName: String? = null
    var name: String = _name
        get() {
            if (tempName == null) tempName = "NONAME"
            return tempName ?: throw AssertionError("Asserted by others")
        }
    var age: Int = _age
}

fun main() {
    val user1 = User3(1, "kildong", 35)
    user1.name = ""
    println("user1.name = ${user1.name}")
}