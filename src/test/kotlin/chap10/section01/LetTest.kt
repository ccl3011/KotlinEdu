package chap10.section01

fun main(){
    var score: Int? = 32
    score = null
    fun checkScore() {
        if (score != null) {
            println("score: $score")
        }
    }

    fun checkSocreLet() {
        score.let { println("score: $it") } //socre: null
        //세이프콜(?.)을 넣어 null이 아닐때만 동작하게끔
        //score?.let { println("score: $it") }
    }

    checkScore()
    checkSocreLet()
}