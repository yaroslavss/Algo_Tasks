package task

/**
 * Task 3. Удаление в строке
 * https://www.codewars.com/kata/5727bb0fe81185ae62000ae3
 */
class Task3 {

    fun run(input: String): String {
        val sb = StringBuilder()

        for (i in input.indices) {
            if (input[i] == ERASE_SYMBOL) {
                if (sb.length > 0) {
                    sb.deleteCharAt(sb.length - 1)
                }
            } else {
                sb.append(input[i])
            }
        }

        return sb.toString()
    }

    companion object {
        const val ERASE_SYMBOL = '#'
    }
}