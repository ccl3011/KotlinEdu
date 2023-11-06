package chap03.section03

fun main() {
    //매개변수 없는 람다식 함수
    noParam({ "Hello World!" })
    noParam { "Hello World!" } //위와 동일 결과, 소괄호 생략 가능

    //매개변수가 하나 있는 람다식 함수
    oneParam({ a-> "Hello World! $a"})
    oneParam { a-> "Hello World! $a"} //위와 동일 결과, 소괄호 생략 가능
    oneParam { "Hello World! $it"} //위와 동일 결과, it으로 대체 가능

    //매개변수가 두 개 있는 람다식 함수
    moreParam { a,b -> "Hello World! $a $b"} //매개변수명 생략 불가
    moreParam { _,b -> "Hello World! $b"} //첫 번째 문자열은 사용하지 않고 생략

    //인자와 함께 사용하는 경우
    withArgs("Arg1","Arg2", {a,b -> "Hello World! $a $b"}) //①
    //withArgs()의 마지막 인자가 람다식인 경우 소괄호 바깥으로 분리 가능
    withArgs("Arg1","Arg2") {a,b -> "Hello World! $a $b"} //②
}

//매개변수가 없는 람다식 함수가 noParam 함수의 매개변수 out으로 지정됨
fun noParam(out: () -> String) = println(out())

//매개변수가 하나 있는 람다식 함수가 oneParam함수의 매개변수 out으로 지정됨
fun oneParam(out: (String) -> String) {
    println(out("OneParam"))
}

//매개변수가 두 개 있는 람다식 함수가 moreParam 함수의 매개변수로 지정됨
fun moreParam(out: (String,String) -> String) {
    println(out("OneParam", "TwoParam"))
}

//withArgs함수는 일반 매개변수 2개를 포함, 람다식 함수를 마지막으로 매개변수로 가진
fun withArgs(a:String, b:String, out: (String, String) -> String) {
    println(out(a,b))
}