package chap05.section2

class Bird {
    //프로퍼티들 - 선언만 함
    var name: String
    var wing: Int
    var beak: String
    var color: String

    //부 생성자 - 매개변수를 통해 초기화할 프로퍼티에 지정(여러개 가능)
    /*constructor(name: String,wing: Int, beak: String,color: String){
        this.name = name //this.wing는 선언된 현재 클래스의 프로퍼티를 나타냄
        this.wing = wing
        this.beak = beak
        this.color = color
    }*/

    //부 생성자 - this 키워드를 생략하고 하는 경우
    constructor(_name: String, _wing: Int, _beak: String, _color: String){
        name = _name //this.wing는 선언된 현재 클래스의 프로퍼티를 나타냄
        wing = _wing
        beak = _beak
        color = _color
    }
    //메서드들
    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")
}

fun main() {
    val coco = Bird("mybird", 2, "short", "blue") //생성자의 인자로 객체 생성과 동시에 초기화

}