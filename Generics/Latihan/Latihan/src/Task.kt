// Coming Soon
fun main() {
    val stringResult = getResult("Kotlin")
    val intResult = getResult(100)

    // TODO 2
    println("String $stringResult")
    println("String $intResult")
}

// TODO 1
fun <T> getResult(args: T): Int {
    val nilai = if (args is Int) args * 5 else if (args is String) args.length else 0
    return nilai
}