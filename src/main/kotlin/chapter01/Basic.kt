package chapter01

class Basic {
    fun basic(){
        var name1 = "kotlin"
        var name2: String
        name2 = "kotlin"

        name1 = "more kotlin"

        val immutableName = "kotlin"

        val explicitType: Number = 12.3

        val int = 123
        val long = 123456L
        val double = 12.34
        val float = 12.34f
        val hexadecimal = 0xAB
        val binary = 0b01010101

        val long2 = int.toLong()
        val double2 = float.toDouble()

        val leftShift = 1 shl 2
        val rightShift = 1 shr 2
        val unsignedRightShift = 1 ushr 2

        val char = '\u1234'
        println(float)

        var array = arrayOf(1, 2, 3)
        println(array.contentToString())

        val perfectSquares = Array(10) {k -> k * k}
        println(perfectSquares.contentToString())
        perfectSquares[5] = 16
        println(perfectSquares[5])
        println(perfectSquares.contentToString())
        println(perfectSquares.size)

        val s1 = "Sam"
        val s2 = "hello $s1"
        println("s2 = $s2")

        val s3 = "hello $s1"
        val s4 = "hello $s1. Your name has ${s1.length} characters"
        println("s4 = $s4")

        val aToz = "a".."z"
        val oneToNine = 1..9
        println("c" in aToz)
        println(11 in oneToNine)

        val countingDown = 100.downTo(0)
        println(countingDown)
        println(50 in countingDown)

        val rangeTo = 10.rangeTo(20)
        println(rangeTo)

        val oneToFifty = 1..50
        val oddNumbers = oneToFifty.step(2)
        println(oneToFifty.sortedDescending())
        println(oddNumbers.sorted())
        println(oddNumbers.forEach(){
            println(it)
        })
        println(4 in oddNumbers)
        println(5 in oddNumbers)

        val countingDownEvenNumbers = (2..100).step(2).reversed()
        println(countingDownEvenNumbers)

//        val list = listOf(1,2,3,4)
//        for(k in list){
//            println(k)
//        }
//
//        val set = setOf(1,2,3,4)
//        for (k in set){
//            println(k)
//        }

        val oneToTen = 1..10
        for (k in oneToTen){
            for(j in 1..5){
                println(k * j)
            }
        }

        val string = "print my characters"
        for (char in string){
            print(char)
            print(" ")
        }
        println()

        for (index in array.indices){
            println("Element $index is ${array[index]}")
        }

    }

    fun plusOne(x: Int) = x + 1
}