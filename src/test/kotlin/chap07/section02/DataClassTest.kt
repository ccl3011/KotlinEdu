package chap07.section02

//Tools > Kotlin > Show Kotlin Bytecode > Decompile 버튼 클릭 시 java 소스 확인
data class Customer(var name: String, var email: String) //데이터 클래스 DTO
{ //로직 블록 없어도 됨
    var job: String = "Unknown"
    //부생성자
    constructor(name: String, email: String, _job:String) : this(name, email) {
        job = _job
    }
    init { //간단한 로직
        this.name = "Mr/Ms " + this.name
    }
}

fun main() {
    val cus1 = Customer("Kildong", "kil@email.com")
    println(cus1)
    val (name, email) = cus1 //선언명 없이
    println("name = $name, email = $email")

    val n1 = cus1.component1()
    val n2 = cus1.component2()
    val n3 = cus1.job
    println("name = $n1, email = $n2, job = $n3")

    val lambda1 = {
        (name, email): Customer ->
        println(name)
        println(email)
    }

    lambda1(cus1)
}