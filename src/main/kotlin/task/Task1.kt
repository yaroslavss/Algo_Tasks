package task

/**
 * Task 1. Маска карты
 * https://www.codewars.com/kata/5412509bd436bd33920011bc
 */
class Task1 {

    fun maskify(input: String): String {
        var n = 0
        val sb = StringBuilder()

        for (i in input.length - 1 downTo 0) {
            if (n++ < NOT_MASKIFIED_SYMBOLS_NUMBER) {
                sb.append(input[i])
            } else {
                sb.append('#')
            }
        }

        return sb.toString().reversed()
    }

    companion object {
        const val NOT_MASKIFIED_SYMBOLS_NUMBER = 4
    }
}