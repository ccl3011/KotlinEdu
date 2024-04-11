package chap10.section01

import java.io.File
import java.io.FileOutputStream
import java.io.PrintWriter

//use() 사용시 java의 close()를 자동으로 호출해 닫아준다
fun main() {
    PrintWriter(FileOutputStream("d:\\test\\output.tst")).use{
        it.println("hello")
    }
}