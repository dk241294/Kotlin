fun main() {
    var finalAmt: Int
    finalAmt = calculate(50, 0.04)
    println(finalAmt)
    finalAmt = calc(50)
    println(finalAmt)
    finalAmt = cal(50, 0.03)
    println(finalAmt)
    //named parameter
    finalAmt=cal(interest = 0.08,amt = 50)
    println(finalAmt)
}

//first way
fun calculate(amt: Int, interest: Double): Int {
    return (amt + amt * interest).toInt()
}

//Second way (default parameter)
fun calc(amt: Int, interest: Double = 0.04): Int {
    return (amt + amt * interest).toInt()
}

//3rd way in java we need to create to method but her just give another value it will replace default one
@JvmOverloads
fun cal(amt: Int, interest: Double = 0.04): Int {
    return (amt + amt * interest).toInt()
}