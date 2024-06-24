package task

/**
 * Task 10, 8 kyu
 * https://www.codewars.com/kata/5583090cbe83f4fd8c000051
 */
class Task10 {

    fun run(input: Int): Array<Int> {
        val inputStr = input.toString()
        val result = Array(inputStr.length) { 0 }
        var n = 0

        for (char in input.toString().reversed()) {
            result[n++] = char.toString().toInt()
        }

        return result
    }
}