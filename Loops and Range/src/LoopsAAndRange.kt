fun main() {
    var a = 2 until 10
    var count = 0
    println("Total number of variable in a ${a.count()}")
    for (b in a step 2) {
        println(b)
        count++
    }
    /*
    1. ..
    2. down to (it is a method)
    3. until (where last value not included)
    4. for incrementing/decrementing step is used and it always positive.

     */

    println("Total variable printed $count")
    a()

}
fun a(){
    var nums='A'..'z'
    for (b in nums){
        println(b)
    }
    println("Total number of character from A to z are ${nums.count()}")
}