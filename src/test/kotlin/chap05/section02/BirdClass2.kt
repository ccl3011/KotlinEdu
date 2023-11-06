package chap05.section02.bird2

class Bird /*constructor() //생략가능*/
    (var name: String ="NONAME", var wing: Int,var beak: String, var color: String) {

    init {
        println("-----초기화 블록 시작-----")
        println("이름은 $name, 부리는 $beak")
        this.sing(3)
        println("-----초기화 블록 끝-----")
    }
    //메서드들
    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")
}

fun main() {
    val coco = Bird(wing=2, beak="short",color="yellow") //생성자의 인자로 객체 생성과 동시에 초기화
    coco.color = "Blue"

    println("coco.name: ${coco.name}")
    println("coco.color: ${coco.color}")
    coco.fly()
    coco.sing(3)
}

