
/*
fun `fun`() {
    val list: List<Int> = listOf(1,2,3)
    val list2: MutableList<Int> = list.toMutableList()
    val list3 = list2.toList()
}
*/

fun main() {
    /*mylist() */
    val max_num: Long = Long.MIN_VALUE
    myfunc2(max_num)

}

fun mylist() {
    val list: MutableList<Int> = mutableListOf()
    addnum(list)
}

fun addnum(list:MutableList<Int>) {
    while (true) {
        println("Введите число")
        val type = readLine()!!
        val num: Int = type.toInt()
        list.add(num)
        println("'Enter', чтобы продолжить ввод чисел")
        println("'q', чтобы завершить ввод чисел")
        val choose = readLine()!!
        val ch: String = choose.toString()
        if (ch == "q") {
            showfunc(list)
            break

        }
    }
}

fun showfunc(list:MutableList<Int>) {
    println(list)
    val max: Int = list.maxOrNull() ?: 0
    println("Наибольшее число: $max")
}


fun myfunc2(max_num: Long) {
    var local_max: Long
    local_max = max_num
    while (true) {
        println("Введите число")
        val type = readLine()!!
        val num: Long = type.toLong()
        if (num > local_max) {
            local_max = num
        }
        println("'Enter', чтобы продолжить ввод чисел")
        println("'q', чтобы завершить ввод чисел")
        val choose = readLine()!!
        val ch: String = choose
        if (ch == "q") {
            println("Наибольшее число: $local_max")
            break
        }
    }
}