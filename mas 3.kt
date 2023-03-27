

fun encryptOrDecrypt(array1: Array<Char>, array2: Array<Int>, text: String, isEncrypt: Boolean): String {
    val alphabet = array1.map { it.toLowerCase() }.toTypedArray()
    val shift = if (isEncrypt) array2 else array2.map { 33 - it }.toTypedArray()

    return text.map { c ->
        val index = alphabet.indexOf(c.toLowerCase())
        if (index == -1) c else alphabet[(index + shift[index]) % 33]
    }.joinToString("")
}

fun main(args: Array<String>) {
    val alphabet = arrayOf('А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ё', 'Ж', 'З', 'И', 'Й', 'К', 'Л', 'М', 'Н', 'О', 'П', 'Р', 'С', 'Т', 'У', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ', 'Ъ', 'Ы', 'Ь', 'Э', 'Ю', 'Я')
    val shift = arrayOf(1, 2, 20, 21, 5, 22, 23, 24, 8, 9, 10, 11, 32, 16, 17, 18, 19, 9, 30, 31, 12, 13, 14, 25, 26, 6, 7, 27, 28, 23, 4, 15, 33)
    println("Введите слово")
    val a = readLine()

    val text = a.toString()

    val encrypted = encryptOrDecrypt(alphabet, shift, text, true)


    println("Текст: $text")
    println("Засшифрованный: $encrypted")

}
