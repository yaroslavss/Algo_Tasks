package task

/**
 * Task 7, 7 kyu
 * https://www.codewars.com/kata/5a1e6323ffe75f71ae000026
 */
class Task7 {

    fun run(input: String): Boolean {
        val regex = "^(\\d+)\\+(\\d+)=(\\d+)\$".toRegex()
        val matchResult = regex.find(input)!!
        val (value1, value2, result) = matchResult.destructured

        return value1.reversed().toInt() + value2.reversed().toInt() == result.reversed().toInt()
    }
}