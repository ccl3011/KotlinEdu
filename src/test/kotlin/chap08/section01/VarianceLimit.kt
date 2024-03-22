package chap08.section01

open class Animal(val size: Int) {
    fun feed() = println("Feeding...")
}
class Cat(val jump: Int): Animal(50)

class Spider(val poison: Boolean): Animal(1)

//1 형식 매개변수를 Animal로 제한
class Box2<out T: Animal>(val element: T) { //주 생성자에서 val만 허용
    fun getAnimal(): T = element //2 out은 반환 자료형에만 사용할수 있음
    /*
    * fun set(new: T) { //3 오류! T는 in 위치에 사용할수 없음
    *   element = new
    * }
    * */
}

fun main(){
    //일반적인 객체 선언
    val c1: Cat = Cat(10)
    val s1: Spider = Spider(true)

    //클래스의 상위 자료형 변환은 아무런 문제 없음
    var a1: Animal = c1
    a1 = s1 //4 a1은 Spider의 객체가 됨
    println("a1.size = ${a1.size}")

    //5 공변성- Cat은 Animal의 하위 자료형
    val c2: Box2<Animal> = Box2<Cat>(Cat(10))
    println("c2.element.size = ${c2.element.size}")

    //반대의 경우는 가능하지 않음
    //val c3: Box<Cat> = Box<Animal>(10) //오류

    //자료형이 제한되어 Animal과 하위 클래스 이외에는 사용할수 없음
    //val c4: Box<Any> = Box<Int>(10) //오류
}