package chap06.section03
//자바에선 static 코틀린에선 컴페니언(Companion) 사용
//프로그램 실행 시 고정적으로 가지는 메모리로 객체 생성 없이 사용
//단, 자주 사용되지 않는 변수나 객체를 만들면 메모리 낭비
class Person {
    var id: Int = 0
    var name: String = "Seungyeon"
    companion object {
        var language: String = "Korean"
        fun work() {
            println("working...")
        }
    }
}

fun main() {
    println(Person.language) //인스턴스를 생성하지 않고 기본값 사용
    Person.language = "English" //기본값 변경 가능
    println(Person.language) //변경된 내용 출력
    Person.work() //메서드 실행
    // println(Person.name) //name은 companion object가 아니므로 에러
}