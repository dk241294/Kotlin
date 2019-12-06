fun main() {
    var numOfFish = 499
    var numOfPlant = 25

    /*********** Test for condition in Kotlin
     * 1.if  (for comparing)
     * 2.when  (kotlin way of switching)
     * both if and when can be nested(else) and use ranges
     *******************************/

    //*********************
    if (numOfFish in 1..100) {
        println(numOfFish)
        println("in range")
    } else println("not in range")
    //****************************************
    when (numOfFish) {
        0 -> println("put some fish in aquarium")
        50 -> println("perfect")
        in 1..500 -> ("Nothing to say")
        else -> println("Too Much")
    }
    println("the number of is $numOfFish and The Number of Plant is $numOfPlant")
    //******************************************************************************************
    if (numOfFish > numOfPlant) {
        println("Too much fish ")
    } else {
        println("Too much plant")
    }
    //*************************************************************************************************
    if (numOfFish == numOfPlant)
        println("true")
    else
        println("false")
//***************************************
    if (numOfFish != numOfPlant)
        println("not equal")

    //************
    var fish = 22
    fish = fish.minus(1)
    println(fish) //21
    fish = fish.times(2)
    println(fish)//42
    fish = fish.inc() + 1
    println(fish)//44
    fish = fish.div(2)
    println(fish)//22
    fish = fish.plus(5)
    println(fish)


    /*******
     * there are two type of variable in kotlin changeable and unchangable
    **/
    val num1=50
    //num1=52 show errror unchangable
    var num2=20
    num2=500

 /*kotlin help avoid null point exception in
    1.when declare variaable explicitly it value cant be null
    var a:Int=null (x)
    var a:Int?=null (right)-->question mark indicate variable can be null
    2.in complex data type like list .you can allow list to be null
    var a:List<String>?=null
  */

    /*null testing
    can do null testing with the question mark operator saving lots of if-else statement
    ex:can check whether object or variable is non null before accessing one of its methods
    elvis operator ?:
     */


}