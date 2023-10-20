package section3

import java.util.concurrent.locks.ReentrantLock

var sharable = 1 //보호가 필요한 공유 자원

fun main() {
    val reLock = ReentrantLock()

    //세 표현식이 모두 동일
    //lock(reLock, { criticalFunc()})
    //lock(reLock) { criticalFunc() }
    //lock(reLock, ::criticalFunc)

    println(sharable)
}

fun criticalFunc() {
    //공유 자원 접근 코드 사용
    sharable += 1
}