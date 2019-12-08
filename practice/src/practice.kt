import java.util.*

fun main() {

    val trout = "trout"
    var haddock = "haddock"
    haddock = "hilsa"
    var snapper = "snapper"
    println("I like $trout and $haddock but not a big fan of $snapper")
    var fishname = "hilsa"
    when (fishname.length) {
        0 -> println("error ")
        in 3..12 -> println("good fish name")
        else -> println("too long")

    }
    dayOfWeek()
    //  hello()
    var obj = Human(300)
    obj.think()
    var obj1= Human.Alien()
    obj1.think()
}

fun dayOfWeek() {
    println("What day is Today?")
    var c = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    println(
        when (c) {
            1 -> "Sunday"
            2 -> "Monday"
            3 -> "Tuesday"
            4 -> "Wednesday"
            5 -> "Thrusday"
            6 -> "Friday"
            7 -> "Saturday"
            else -> "not a day"
        }
    )


}

//fun hello(args: Array<String>){
//    println("Hello ${args[0]}")
//}
open class Human constructor(var s: String = "deepak") {
    var name = s
    var age: Int=20
    open fun think() {
        println("kotlin is Awesome $name age is $age")
    }

    constructor(age: Int) : this() {
        this.age = age;
    }
    class Alien : Human() {
        override fun think(){
            println("awesome")
        }

    }

}