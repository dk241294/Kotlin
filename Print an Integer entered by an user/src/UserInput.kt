import java.util.*

fun main() {
    /* Creates a reader instance which takes input from standard input - keyboard */
    var reader = Scanner(System.`in`)
    // nextInt() reads the next integer from the keyboard
    var num = reader.nextInt()
    println(num)

    var numr = reader.nextFloat()
    println(numr)
    input()
}
fun input(){
    //we use the function readLine() to read a line of string from the keyboard.
    // Since readLine() can also accept null values, !! operator ensures not-null value of variable stringInput.
    var num= readLine()!!
    var Integer=num.toInt()
    println(Integer)
}