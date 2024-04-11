package chap10.section03

import java.io.IOException
import java.nio.file.Files
import java.nio.file.Paths
import java.nio.file.StandardOpenOption

fun main() {
    val path = "D:\\test\\hello.txt"
    val text = "Hello World. \n안녕하세요"
    try{
        Files.write(Paths.get(path), text.toByteArray(), StandardOpenOption.CREATE)
    } catch(e: IOException) {
        //예외 처리
    }

}