import KotlinEdu.main.Person

fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    val person = Person("CSY",26)
    println(person.name)
    println(person.age)

    var num1=10
    var num2=10
    val result1 = ++num1
    val result2 = num2++

    println("result1: $result1")
    println("result2: $result2")

    println("num1: $num1")
    println("num2: $num2")
}