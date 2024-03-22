package chap08.section01

open class Parent

class Child : Parent()

class Cup<T>

fun main() {
    val obj1: Parent = Child() //캐스팅 - Parent 형식의 obj1은 Child로 형변환 가능
    //val obj2: Child = Parent() //하위 형식 객체 obj2는 Parent로 변환불가

    //val obj3: Cup<Parent> = Cup<Child>() //Type mismatch
    //val obj4: Cup<Child> = Cup<Parent>() //생성자 표현법 //Type mismatch

    val obj5 = Cup<Child>() //obj5는 Cup<Child> 형식이 됨
    val obj6: Cup<Child> = obj5 // 형식이 일치
}