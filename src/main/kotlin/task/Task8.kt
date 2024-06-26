package task

/**
 * Task 8, 7 kyu
 * https://www.codewars.com/kata/56a4872cbb65f3a610000026
 */
class Task8 {

    fun max_rot(input: Int): Int {
        val numbers: MutableList<Int> = mutableListOf()
        numbers.add(input)
        numbers.add(input.toString().shiftLeft().toInt())

        for (i in 1..<input.toString().length) {
            val baseStr = numbers.last().toString()
            val startStr = baseStr.substring(0, i)
            val endStr = baseStr.substring(i, baseStr.length).shiftLeft()
            numbers.add((startStr + endStr).toInt())
        }

        return numbers.max()
    }
}

fun String.shiftLeft(): String {
    val sb = StringBuilder()
    return sb
        .append(this.substring(1, this.length))
        .append(this.first())
        .toString()
}