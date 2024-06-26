package task

/**
 * Task 4. Телефонный номер
 * https://www.codewars.com/kata/525f50e3b73515a6db000b83
 */
class Task4 {

    fun createPhoneNumber(arr: ShortArray): String {
        val sb = StringBuilder("(")

        for (i in arr.indices) {
            when (i) {
                3 -> sb.append(") ")
                6 -> sb.append('-')
                else -> {}
            }
            sb.append(arr[i])
        }

        return sb.toString()
    }
}