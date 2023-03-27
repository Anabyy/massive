import java.util.Scanner

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    var digits = IntArray(10) { 0 }

    println("Введите кол во строк: ")
    val rows = scan.nextInt()
    println("Введите кол во столбцов: ")
    val cols = scan.nextInt()

    val arr = Array(rows) { IntArray(cols) }

    println("Введите $rows x $cols матрицу: ")
    for (i in 0 until rows) {
        for (j in 0 until cols) {
            arr[i][j] = scan.nextInt()
            if (arr[i][j] < 100 || arr[i][j] > 999) {
                println("введите трехзначное число")
                return
            }
        }
    }

    for (i in 0 until rows) {
        for (j in 0 until cols) {
            val num = arr[i][j]
            digits[num / 100]++
            digits[num % 10]++
            digits[num / 10 % 10]++
        }
    }

    println("Массив:")
    for (i in 0 until rows) {
        for (j in 0 until cols) {
            print("${arr[i][j]}   ")
        }
        println()
    }

    var differentDigits = 0
    for (i in 0..9) {
        if (digits[i] > 0) {
            differentDigits++
        }
    }
    println("$differentDigits разных чисел")
}
