package section3

fun main() {
    var result: Int

    //일반 변수에 람다식 할당
    val multi = {x:Int, y:Int -> x*y}
    val multi1 = {x:Int, y:Int ->
        println("x*y")
        x*y}
    val multi2 : (Int, Int) -> Int = {x:Int, y:Int -> x*y}
    val multi3 : (Int, Int) -> Int = {x, y -> x*y}

    val greet : () -> Unit = { println("Hello") }
    //람다식이 할당된 변수는 함수처럼 사용 가능
    result = multi1(10,20)
    println(result)

    println(greet)
    greet()

}