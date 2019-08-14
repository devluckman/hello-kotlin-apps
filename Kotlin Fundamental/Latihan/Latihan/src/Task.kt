fun main() {
    val valueA = 65
    val valueB = 52
    val valueC = 78

    val result = calculate(valueA, valueB, valueC)

    // TODO 3
    println(result)
}

fun calculate(valueA: Int, valueB: Int, valueC: Int?): String {
    // TODO 1
    val cvalueC = valueC ?: 100
    val result = valueA + (valueB - cvalueC)
    return generateResult(result)
}

// TODO 2
fun generateResult(result: Int) = "Result is $result"