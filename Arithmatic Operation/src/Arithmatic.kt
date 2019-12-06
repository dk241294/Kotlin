fun main() {
    var result = add(1, 2)
    println(result)
    result = sub(2, 66)
    println(result)
    result = mul(2, 90)
    println(result)
    var result1: Float
    result1 = divide(55, 44)
    println(result1)
    result1 = mod(22, 10)
    println(result1)
    result = max(3, 22)
    println(result)
    result = max2(33, 22)
    println(result)
}

fun add(a: Int, b: Int): Int {
    return a + b
}

fun sub(a: Int, b: Int): Int {
    return a - b
}

//we can also write in single line. no need to write  return
fun mul(a: Int, b: Int): Int = a * b

fun divide(a: Int, b: Int): Float {
    return ((a / b).toFloat())
}

fun mod(a: Int, b: Int): Float = (a % b).toFloat()
fun max(a: Int, b: Int): Int {
    if (a > b)
        return a
    else
        return b
}
//OR
fun max2(a: Int, b: Int): Int=if(a>b)a else b
/*
function should we something that take some input which does some processing and give u output
its better if function always return a value becuse that make your system stable
when u return a value u give a return type
 */