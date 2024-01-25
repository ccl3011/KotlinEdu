package chap06.section01

class User(_id: Int, _name: String, _age: Int) {
    //프로퍼티
    val id: Int = _id
        get() = field //보조(임시) 필드. 프로퍼티 id 를 직접 넣을경우 무한 호출되는 재귀에 빠짐.

    var name: String = _name
        get() = field
        set(value) { //value 대신 무슨 이름와도 상관 없음. 외부값 받기만 하면됨
            field = value
        }

    var age: Int = _age
        get() = field
        set(value) {
            field = value
        }
}

fun main() {
    val user1 = User(1, "Kildong", 30)
    // user1.id = 2 //Error val 프로퍼티는 값 변경불가 (불변)
    user1.age =35 //세터 동작
    println("user1.age = ${user1.age}") //게터 동작
}