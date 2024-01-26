package chap06.section03

//코틀린에서 자바의 static 접근
//변경되지 않는 값인 상수 표현은 대문자로 선언이름 지정 (LEVEL)
fun main() {
    println(Customer.LEVEL)
    Customer.login()
}