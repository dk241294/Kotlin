//////import kotlin.random.Random
//////
//////fun main(){
//////feedtheFish()
//////}
//////fun feedtheFish(){
//////    val day =dayofTheweek()
//////    val food=fishFood(day)
//////println("$food+$day")
//////}
//////fun dayofTheweek():String{
//////    var week = listOf<String>("monday","Tuesday","Wednesday","Thrusday","Friday","Sturday","Sunday")
//////    return week[Random.nextInt(7)]
//////}
//////fun fishFood(day:String):String{
//////    var food="fasting"
//////    when(day){
//////        "monday"->food="pellets"
//////        "tuesday"->food="flakes"
//////        "wednesday"->food="redworm"
//////    }
//////    return  food
//////}
////fun main(args: Array<String>) {
////    var a = 50
////    var b = 40
////
////    // here if-else returns a value which
////    // is to be stored in max variable
////    var max = if (a > b) {
////
////        println("Greater number is: ")
////        print("Greater number is: ")
////        a
////
////    } else {
////        print("Greater number is:")
////        b
////
////    }
////    print(max)
//////}
////fun main(){
////    name()
////}
////fun name(){
////    var name= arrayOf("deepak","shyam","ram","llal")
////    var index=0
////    while(index<name.size){
////        println(name[index])
////        index++
////    }
////}
////fun main(){
////    for (i in 3 downTo -5 step 1){
////        println(i)
////    }
////}
////fun main(args: Array<String>) {
////
////    var planets = listOf("Earth", "Mars", "Venus", "Jupiter", "Saturn",1, 23, 2.2)
////
////    for ((index,vall) in planets.withIndex()) {
////        println("$index and $vall")
////    }
////}
////import java.util.*
////fun main(args: Array<String>) {
////    var reader = Scanner(System.`in`)
////   print("Enter name:")
////    var lb = reader.next()
////
////    when(lb) {
////        "Sun" -> println("Sun is a Star")
////        "Moon" -> println("Moon is a Satellite")
////        "Earth" -> println("Earth is a planet")
////    }
////}
//fun main(args: Array<String>) {
//    print("Enter name:")
//
//    try {
//        var lb = readLine()!!.toInt()
//        when (lb) {
//            1 -> println("Sun is a Star")
//            2 -> println("Moon is a Satellite")
//            3 -> println("Earth is a planet")
//            else -> {
//                println("deepak")
//            }
//        }
//
//    } catch (e: Exception) {
//        println("Not an Integer")
//    }
//
//}
//fun main() {
//    month()
//}
//
//fun month() {
//    println("enter the no.")
//    var month = readLine()?.toInt()
//    var m = when (month) {
//        1 -> "jan"
//        2 -> "feb"
//        3 -> "mar"
//        4 -> "apr"
//        else -> {
//            print("khdjj")
//        }
//    }
//    println(m)
//}
//import java.util.*
//fun main(args: Array<String>) {
//    var reader = Scanner(System.`in`)
//    print("Enter the month number:")
//    var monthOfYear = reader.nextInt()
//    var month = when(monthOfYear){
//       1,2,3,4-> println("Its an integer")
//        else -> {
//            println("Not a month of year")
//        }
//    }
//    println(month)
//}
//import java.util.*
//fun main(args: Array<String>) {
//    var reader = Scanner(System.`in`)
//    print("Enter the month number:")
//    var monthOfYear = reader.nextInt()
//    var month = when(monthOfYear){
//        1->"January"
//        2->"Febuary"
//        3->"March"
//        4->"April"
//        5->"May"
//        6->"June"
//        7->"July"
//        8->"August"
//        9->"September"
//        10->"October"
//        11->"November"
//        12->"December"
//        else -> {
//            println("Not a month of year")
//        }
//    }
//    println(month)
//}
fun main() {
    series()
}

fun series() {
    for (i in 1..5) {
        for (j in 1..5) {
            if (i ==j) {
                print("* ")
            }
            else print(" ")
        }
        println()
    }
}