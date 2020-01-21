fun main() {
    ArrayListEx()
}

fun ArrayListEx(){

    var a = arrayListOf<String>()
    a.add("rudra")
    a.add("kumar")
    a.removeAt(0)
    a.remove("kuma")
    println(a.get(0))
    a.set(0,"love")
    for (i in a){
        println(i)
    }

}
fun MutableListEx(){

    var e = mutableListOf<String>("a")
    e.add("garrry sandhu")
    e.set(0, "Love")
    for (i in e) {
        println(i)
    }
    println(e.get(0))
    var l = mutableListOf<String>()
    l.add("gippy grewal" )
    l.addAll(e)
    for (i in l) {
        println(i)
    }
}

