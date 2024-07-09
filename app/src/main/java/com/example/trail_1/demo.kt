package com.example.trail_1

class demo {
    printHello(name = "hello")
    drive(speed = "slow")
    tempToday("mon",32)
    var name:String = "Siva"
    println(name.commaSeperated("some other string"))
}

fun printHello(name: String?){
    fun drive(speed: String = "fast") {
        fun tempToday(day: String, temp: Int) {
            println("Today is $day and it's $temp degrees.")
        }

        fun String.commaSeperated( values:String):String{
            return  "comma seperated string --"+ values

        }
}