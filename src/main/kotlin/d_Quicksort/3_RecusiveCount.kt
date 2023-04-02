package d_Quicksort

private fun count(list: List<Any>): Int = when {
    list.isEmpty() -> 0
    else -> 1 + count(list.subList(1, list.size))
}

fun main() = println(count(listOf(1, 2, 3, 4, 5)))
