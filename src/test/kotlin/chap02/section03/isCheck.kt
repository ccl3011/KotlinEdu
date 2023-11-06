package chap02.section03

/*메소드로 대신 만듦*/
fun main() {
    val num = 256

    if (num is Int) {
        print(num)
    }else if (num !is Int) { //!(num is Int) 와 동일
        print("Not a Int")
    }
}