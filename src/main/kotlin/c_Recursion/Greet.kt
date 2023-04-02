package c_Recursion

private fun greet2(name: String) = println("how are you, $name?")

private fun bye() = println("ok bye!")

private fun greet(name: String) {
    println("hello, $name!")
    greet2(name)
    println("getting ready to say bye...")
    bye()
}

fun main() = greet("adit")