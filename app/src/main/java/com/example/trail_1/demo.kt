package com.example.trail_1

fun main() {
class demo {
    val s = Square(10)
    for (i in 1..5) print(i)

    printHello(name = "hello")
    drive(speed = "slow")
    tempToday("mon",32)
    var name: String = "Siva"
    println(name.commaSeperated("some other string"))
}

fun printHello(name: String?){
    fun drive(speed: String = "fast") {
        fun tempToday(day: String, temp: Int) {
            println("Today is $day and it's $temp degrees.")
        }

        fun String.commaSeperated( values:String):String {
            return "comma seperated string --" + values

        }

        }
}}

class Square(val side: Int) {
    init {
        println(side * 2)
    }
}