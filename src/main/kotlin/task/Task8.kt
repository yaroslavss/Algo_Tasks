package task

/**
 * Task 8, 7 kyu
 * https://www.codewars.com/kata/56a4872cbb65f3a610000026
 */
class Task8 {

    fun max_rot(input: Long): Long {
        val numbers: MutableList<String> = mutableListOf()
        numbers.add(input.toString())
        numbers.add(input.toString().shiftLeft())

        for (i in 1..<input.toString().length) {
            val baseStr = numbers.last()
            val startStr = baseStr.substring(0, i)
            val endStr = baseStr.substring(i, baseStr.length).shiftLeft()
            numbers.add("$startStr$endStr")
        }

        return numbers
            .map { it.toLong() }
            .max()
    }
}

fun String.shiftLeft(): String {
    val sb = StringBuilder()
    return sb
        .append(this.substring(1, this.length))
        .append(this.first())
        .toString()
}