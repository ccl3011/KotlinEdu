package chap10.section03

import java.io.File
import java.io.PrintWriter

fun main() {
    val text = "Hello World! \t\n안녕하세요\n"
    val path = "D:\\test\\testFile.txt"

//    val file = File(path)
//    val printWriter = PrintWriter(file)
//
//    printWriter.write(text)
//    printWriter.flush()
//    printWriter.close()

    //File(path).printWriter().use { out -> out.println(text) }
    File(path).printWriter().use { it.println(text) } //위와 동일
}