package chap07.section01

//상속가능한 클래스
open class Animal(val name: String)
//1 feeding의 구현을 위해 인터페이스 Pet 지정
class Dog(name: String, override var category: String) : Animal(name), Pet {
    override var species: String = "dog"
    override fun feeding() {
        println("Feed the dog a bone")
    }
}

class Master {

    //인터페이스를 객체로 매개변수를 지정함
    fun playWithPet(pet: Pet) {
        println("Enjoy with my ${pet.species}")
    }
    /* //위처럼 개선
    fun playWithPet(dog: Dog) { //2 각 애완동물 종류에 따라 오버로딩됨
        println("Enjoy with my dog")
    }
    fun playWithPet(cat: Cat) { //3 고양이를 위한 메서드
        println("Enjoy with my cat")
    }*/
}

fun main() {
    val master = Master()
    val dog = Dog("Toto", "Small")
    val cat = Cat("Coco")
    master.playWithPet(dog)
    master.playWithPet(cat)
}