fun main() {
    val text = "Kotlin".getFirstAndLast()

    val firstChar = text["first"]
    val lastChar = text["last"]

    // TODO 2
    println("$text = first char $firstChar dan last char $lastChar")

}

// TODO 1
fun String.getFirstAndLast() = mapOf<String, Char>("first" to this.first(), "last" to this.last())