package task

/**
 * Task 5. RegEx
 * https://www.codewars.com/kata/56a3f08aa9a6cc9b75000023
 */
class Task5 {

    fun run(input: String): Boolean {
        val regex = "^([a-z]|\\d|_){4,16}\$".toRegex()

        return input.matches(regex)
    }
}