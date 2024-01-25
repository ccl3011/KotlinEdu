package chap06.section01

class User2(_id: Int, _name: String, _age: Int) {
    //프로퍼티
    val id: Int = _id
    var name: String = _name
        set(value) {
            println("The name was changed")
            field = value.toUpperCase() // 받은 인자를 대문자로 변경후 프로퍼티에 저장
        }
    var age: Int = _age
}

fun main() {
    val user1 = User2(1,"Kildong", 35)
    user1.name = "coco" //여기서 사용자 고유의 출력 코드가 실행된다
    println("user2.name = ${user1.name}")
}
