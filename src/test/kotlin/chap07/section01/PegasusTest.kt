package chap07.section01

interface Bird {
    val wings: Int //추상- 재정의 필요
    fun fly() //추상- 재정의 필요
    fun jump() = println("bird jump!")
}

interface Horse {
    val maxSpeed: Int //추상- 재정의 필요
    fun run() //추상- 재정의 필요
    fun jump() = println("jump!, max speed: $maxSpeed")
}

//다중 상속
class Pegasus: Bird, Horse {
    override val wings: Int = 2
    override val maxSpeed: Int = 100
    override fun fly() = println("Fly!")
    override fun run() = println("Run!")
    override fun jump() {
        super<Horse>.jump()
        println("and Jump!")
    }
}