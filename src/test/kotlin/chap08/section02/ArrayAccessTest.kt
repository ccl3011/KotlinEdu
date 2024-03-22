package chap08.section02

import java.util.Arrays

fun main(args: Array<String>) {

    val arr = intArrayOf(1, 2, 3, 4, 5) //특정 자료형 제한 (제한 없이 arrayOf 가능)

    println("arr: ${Arrays.toString(arr)}") //Arrays.toString()은 배열의 내용을 문자열로 변환함
    println("size: ${arr.size}") //size는 배열의 크기를 나타냄
    println("sum(): ${arr.sum()}") //sum()메서드는 배열의 합을 계산해 줌

    //게터에 의한 접근과 대괄호 연산자 표기법
    println(arr.get(2))
    println(arr[2])

    //세터에 의한 값의 설정
    arr.set(2, 7)
    arr[0] = 8
    println("size: ${arr.size} arr[0]: ${arr[0]}, arr[2]: ${arr[2]}")

    //루프를 통한 배열 요소의 접근
    for (i in 0..arr.size -1) {
        println("arr[$i] =${arr[i]}")
    }

    val array = arrayOf(intArrayOf(1,2), //다차원 배열일 때
                        intArrayOf(3,4),
                        intArrayOf(5,6,7))

    println(Arrays.deepToString(array)) // [[1,2], [3,4], [5,6,7]]
}