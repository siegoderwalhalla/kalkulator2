fun main() {
    show_unique_num()
}

fun show_unique_num() {
    for(num in 100..999) {
        check_num(num)
    }
}

fun check_num(num: Int) {
    val first_digit = (num % 10)
    val second_digit = (num / 10) % 10
    val third_digit = (num / 100) % 10
    if(first_digit != second_digit && first_digit != third_digit && second_digit != third_digit) {
        println(num)
    }
}