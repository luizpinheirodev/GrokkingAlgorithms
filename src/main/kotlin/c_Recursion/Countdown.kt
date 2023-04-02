package c_Recursion

private fun countdown(i: Int) {
    println(i)
    when {
        // base case
        i <= 0 -> return
        // recursive case
        else -> countdown(i - 1)
    }
}

fun main() = countdown(5)