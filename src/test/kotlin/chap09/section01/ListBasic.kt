package chap09.section01

fun main() {
    //불변형 List의 사용
    var numbers: List<Int> = listOf(1,2,3,4,5)
    var names: List<String> = listOf("one","two","three")
    var mixed = listOf("One",1,1.5,'c')

    println("numbers $numbers") //[1,2,3,4,5]
    for (name in names) {
        println(name)
    }
    for (num in numbers) print(num) //한줄에서 처리하기
    println()

    println(numbers.size)
    println(numbers.indexOf(3)) //인덱스 값 가져오기
    println(numbers.get(0)) //value 가져오기
    println(numbers[0])
    println(numbers.contains(1))
}