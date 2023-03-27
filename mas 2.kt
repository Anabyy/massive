import java.util.Scanner
fun isSymmetrical(array: Array<IntArray>): Boolean {
    for (i in 0 until array.size) {
        for (j in 0 until array.size) {
            if (array[i][j] != array[j][i]) {
                return false
            }
        }
    }
    return true
}

fun main() {
    val array = arrayOf(//для проверки
        intArrayOf(5, 9, 6, 7, 2),
        intArrayOf(9, 8, 4, 5, 3),
        intArrayOf(6, 4, 3, 8, 7),
        intArrayOf(7, 5, 8, 4, 8),
        intArrayOf(2, 3, 7, 8, 1)
    )


    val scan = Scanner(System.`in`)
    val arr = Array(5) { IntArray(5) }
    println("Введите 5 x 5 матрицу: ")
    for (i in 0 until 5) {
        for (j in 0 until 5) {
            arr[i][j] = scan.nextInt()

        }
    } 

    if (isSymmetrical(arr)) {
        println("Массив семметричный")
    } else {
        println("массив не семметричный")
    }
}
