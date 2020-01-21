fun main() {
    listOfExample()
}

fun listOfExample() {
    val names = listOf<String>("deepak", "dinesh", "Dinkar", "Rahul")
    //method 1
    for (name in names) {
        println(name)
    }
    //method 2
    for (i in 0..names.size - 1) {
        println(names[i])
    }
    //method 3
    names.forEachIndexed({ i, j -> println("names[$i]=$j") })
    //method 4
    val it = names.listIterator()
    while (it.hasNext()){
        val i = it.next()
        println(i)
    }
}
