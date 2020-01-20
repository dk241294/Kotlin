fun main() {
    //listt()
    // sett()
    //employee()
    listmutable()
}

fun listt() {
    val employee_Name = listOf("d", 1, 2, 3, 4, 1)

    for (i in employee_Name) {
        println(i)
    }

}

fun sett() {
    val employee_ID = setOf<Int>(1, 2, 3, 4, 1)
    for (item in employee_ID) {
        println(item)
    }
}

fun employee() {
    val employee = mapOf<Int, String>(1 to "Deepak", 2 to "Dinkar", 3 to " anu", 4 to "alu", 4 to "alu")
    for (e in employee) {
        println(e)
    }
}

fun listmutable() {
    val a = mutableListOf<Int>(1, 2, 3, 4)
    for(i in a){
        println(i)
    }
    a.add(1, 23)
    a.remove(3)


    for (i in a) {
        println(i)
    }
}