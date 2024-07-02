package task

/**
 * Task9, 8 kyu
 * https://www.codewars.com/kata/57fb09ef2b5314a8a90001ed
 */
class Task9 {

    fun run(input: String): String {
        val vowels = "aeiouAEIOU"
        val sb = StringBuilder()

        for (char in input) {
            if (char in vowels) {
                sb.append('!')
            } else {
                sb.append(char)
            }
        }

        return sb.toString()
    }
}