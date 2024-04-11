package chap10.section02

/** DSL Domain-Specific Language 사용되는 목적에 따라 정의가 달라짐
 *  ex) SQL은 오로지 데이터베이스만 다룰 수 있는 언어
 * */
data class Person(var name: String? = null,
                  var age: Int? = null,
                  var job: Job? = null)

data class Job(var category: String? = null,
               var position: String? = null,
               var extension: Int? = null)

//모델을 사용해서 person함수를 만들기
//fun person(block: (Person) -> Unit): Person {
//    val p = Person()
//    block(p)
//    return p
//}
fun person(block: Person.() -> Unit): Person = Person().apply(block)

fun Person.job(block: Job.() -> Unit) {
    job = Job().apply(block)
}

fun main() {

    val person = person {
//        it.name = "Kildong"
//        it.age = 20
        name = "Kildong"
        age = 20
        job {
            category = "IT"
            position = "Android Developer"
            extension = 1234
        }
    }
    println(person)
}