package chapter01

import java.io.IOException
import java.util.*

class Basic2 {
    fun basic(){
        val a = listOf(1)
        val b = listOf(1)
        val sameVal = a == b
        val sameRef = a === b
//        println(sameVal)
//        println(sameRef)

        //평가유무
        println("hello".startsWith("h"))
        val aa = 1
        val date = Date()
        val today = if(date.year == 2020) true else false

        fun isZero(x: Int):Boolean {
            return x==0
        }

        val success = try{
            1 == 1
            true
        } catch(e: IOException){
            false
        }
        println("success $success")

        val str: String? = null
        var str1: String? = null

        val listWithNulls = listOf("Kotlin", null)
        for(item in listWithNulls){
            item?.let{println(it)}
        }
    }

    fun isMinOrMax(x: Int): Boolean{
        val isZero = when(x){
            Int.MIN_VALUE, Int.MAX_VALUE -> true
            else -> false
        }
        return isZero
    }

    fun isMinOrOne(x: Int): Boolean{
        return when(x){
            0, 1 -> true
            else -> false
        }
    }

    fun isAbs(x: Int): Boolean{
        return when(x){
            Math.abs(x) -> true
            else -> false
        }
    }

    fun startsWithFoo(any:Any):Boolean{
        return when(any){
            is String -> any.startsWith("Foo")
            else -> false
        }
    }

    fun whenWithoutArgs(x:Int,y:Int){
        when{
            x<y -> println("x is less than y")
            x>y -> println("x is greater than y")
            else -> println("x must equal y")
        }
    }

    fun addTwoNumbers(a:Int,b:Int):Int{
        return a + b
    }

    fun largestnumber(a:Int,b:Int,c:Int):Int{
        fun largest(a:Int,b:Int):Int{
            if(a>b) return a
            else return b
        }
        return largest(largest(a,b),largest(b, c))
    }

    fun printLessThanTwo(){
        val list = listOf(1,2,3,4)
        list.forEach(fun(x){
            if(x<2)println(x)
            else return
        })
    }

    fun printStringLength(any: Any){
        if(any is String){
            println(any.length)
        }
    }

    fun length(any: Any) {
        val string: String? = any as? String
//        if (string != null) {
//            return string.length
//        }

    }
}

class Person{
    private fun age(): Int = 21
}

class Building(val address: String){
    inner class Reception(val telephone: String){
        fun printAddress() = println(this@Building.address)
        fun printTel() = println(telephone)
    }
}

