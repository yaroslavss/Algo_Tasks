package task

/**
 * Task 2. Работа с массивом
 * https://www.codewars.com/kata/5679aa472b8f57fb8c000047
 */
class Task2 {

    fun run(arr: IntArray): Int {
        for (i in arr.indices) {
            val sum1 = arr.slice(0..i - 1).sum()
            val sum2 = arr.slice(i + 1..arr.size - 1).sum()

            if (sum1 == sum2) return i
        }

        return -1
    }
}