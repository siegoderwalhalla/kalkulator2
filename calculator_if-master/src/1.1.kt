fun main() {
    myfunc()
}

fun myfunc() {
    while (true) {
        try {
            print("Введите 1 число: ")
            val first = readLine()!!
            val num1: Int = first.toInt()
            print("Введите 2 число: ")
            val second = readLine()!!
            val num2: Int = second.toInt()
            print("Введите операцию над числами: ")
            val sign = readLine()!!
            println(calculate(num1, num2, sign))
            println("Введите 1, чтобы продолжить выполнение программы")
            println("Введите 2, завершить программу")
            val choose = readLine()!!
            val ch: Int = choose.toInt()
            if (ch == 2) {
                break
            }
            }
            catch(e: NumberFormatException) {
                println("Неправильный ввод")
                println(e.javaClass)
            }
            catch (e: Exception){
                println("Неправильный ввод")
                println(e.javaClass)
            }
    }
}

fun calculate(num1:Int, num2:Int, sign:String="+"):String {
    return when (sign) {
        "+" -> {
            val r = num1 + num2
            "" + num1 + " + " + num2 + " = " + r
        }
        "-" -> "$num1 - $num2 = ${num1 - num2}"
        "/" -> "$num1 / $num2 = ${num1.toFloat() / num2}"
        "*" -> "$num1 - $num2 = ${num1 - num2}"
        else -> "Ошибка"
    }
}