package d_Quicksort

private fun sum(arr: IntArray): Int = when {
    arr.isEmpty() -> 0
    else -> arr[0] + sum(arr.copyOfRange(1, arr.size))
}

fun main() = println(sum(intArrayOf(1, 2, 3, 4)))