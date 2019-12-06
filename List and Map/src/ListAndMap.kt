import kotlin.math.pow

fun main() {
    var nums = listOf<Int>(1, 2, 3)
    for ((a, i) in nums.withIndex()) {
        println("index $a value $i")
    }
    println(nums[2])
    //method call
    map()
    byte()
    list()

}
//map->key value pair
fun map() {
    var nums = hashMapOf<String, Int>()
    nums["Deepak Kumar"] = 50
    nums["Rajnish Kumar"] = 42
    for ((name, age) in nums) {
        println("$name:$age")
    }
}
fun byte(){
    val array = Array(7){1000.0.pow(it)}
    val sizes = arrayOf("byte", "kilobyte", "megabyte", "gigabyte",
        "terabyte", "petabyte", "exabyte")
    for ((i, value) in array.withIndex()) {
        println("1 ${sizes[i]} = ${value.toLong()} bytes")
    }
}
fun list(){
    var numbers= arrayOf(11..15)
    var m:MutableList<Int> = mutableListOf()
    for (i in 0..100 step 7){
        println(m)
    }
}

