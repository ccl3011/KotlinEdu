package chap07.section01

interface Pet {
    var category: String //abstract 키워드가 없어도 기본은 추상 프로퍼티
    var species: String
    val msgTags: String //val 선언시 게터의 구현이 가능
        // 인터페이스 프로퍼티에는 값을 저장할수 없어 게터 사용
        get() = "I'm your lovely pet"
    fun feeding() //마찬가지로 추상 메서드
    fun patting() { //일반 메서드: 구현부를 포함하면 일반적인 메서드로 기본이 됨
        println("Keep patting!") //구현부
    }
}

class Cat(override var category: String) : Pet {
    override var species = "cat" //CatAndDog.kt 를 위한 프로퍼티
    override fun feeding() {
        println("Feed the cat a tuna can!")
    }
}

fun main() {
    val obj = Cat("Small")
    println("Pet Category: ${obj.category}")
    println("Pet Message Tags: ${obj.msgTags}")
    obj.feeding() //구현된 메서드
    obj.patting() //기본 메서드
}