package task

import kotlin.math.pow

/**
 * Task 6, 6 kyu
 * https://www.codewars.com/kata/5552101f47fc5178b1000050
 */
class Task6 {

    fun run(n: Int, p: Int): Int {
        val str = n.toString()
        var power = p
        var sum = 0.0

        for (i in str.indices) {
            sum += str[i].digitToInt().toDouble().pow(power++)
        }

        return if (sum.toInt() % n == 0)
            sum.toInt() / n
        else -1
    }
}