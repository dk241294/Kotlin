fun main(){
    nullSafety1()
    nullsafety2()
    elvisOperator()
    notNullAssertion()
}
fun nullSafety1(){
    var s :String= "Deepak"
    println(s.length)
    //s= null
}
fun nullsafety2(){
  var firstName= "prakash"
    firstName.let { println(it.toUpperCase()) }
}
fun  elvisOperator(){
    var name : String?="deepak"
    println(name?.length)
    name=null
  //  println(name?.length?:throw IllegalArgumentException("Enter Valid Name?"))
}
fun notNullAssertion(){
    var s:String?="GeekForGeek"
    print(s?.length)
    s=null
   print( s!!.length)
}