package c_Recursion

private fun fact(x: Int): Int = when (x) {
    1 -> 1
    else -> x * fact(x - 1)
}

fun main() = println(fact(5))