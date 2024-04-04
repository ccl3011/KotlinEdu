package chap09.section01

fun main() {
    //가변형 List의 생성 및 추가, 삭제, 변경
    val mutableList: MutableList<String> = mutableListOf<String>("Kildong","Dooly","Chelsu")
    mutableList.add("Ben")
    mutableList.removeAt(1) //인덱스 1 삭제
    mutableList[0] = "Sean" //=set(index: Int, element: E)
    println(mutableList)

    //자료형의 혼합
    var mutableListMixed = mutableListOf("Android","Apple",5,6,'X')
}