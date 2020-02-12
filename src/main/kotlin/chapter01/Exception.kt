package chapter01

import java.io.IOException
import java.nio.file.Files
import java.nio.file.Path

class Exception {
    fun readFile(path: Path): Unit {
        val input = Files.newInputStream(path)
        try{
            var byte = input.read()
            while(byte != -1){
                println(byte)
                byte = input.read()
            }
        } catch (e: IOException){
            println("Error reading from file. Error was ${e.message}")
        } finally {
            input.close()
        }
    }
}