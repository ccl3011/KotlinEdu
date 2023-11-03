package chap05.section3.bird2

//상속 가능한 클래스를 위해 open 사용
open class Bird(var name: String, var wing: Int, var beak: String, var color: String){
    //메서드
    fun fly() = println("Fly wing: $wing")
    open fun sing(vol: Int) = println("Sing vol: $vol") //오버라이딩 가능한 메소드
}

class Parrot(name: String,
             wing: Int=2, beak: String, color:String,)