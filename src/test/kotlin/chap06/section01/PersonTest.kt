package chap06.section01

class Person(_id: Int, _name: String, _age: Int) {

    //프로퍼티(게터 세터 자동 생성)
    val id: Int = _id           // val 불변 (읽기 전용) getter만 설정
    var name: String = _name    // 변경 가능
    var age: Int = _age         // 변경 가능

}

//더 간략히 가능
//class Person(val _id: Int,var _name: String,var _age: Int)

fun main() {
    val person = Person(1,"Sean", 30)

    //게터에 의한 값 획득
    val name = person.name //getter

    //세터에 의한 값 지정
    person.age = 41 //setter

    println("name: $name, ${person.age}")

}