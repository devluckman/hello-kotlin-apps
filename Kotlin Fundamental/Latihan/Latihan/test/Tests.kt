import org.junit.Assert
import org.junit.Test

class Test {

    private fun checkFunction(valueA: Int, valueB: Int, valueC: Int?) {
        val result = (valueA + (valueB - (valueC ?: 100)))
        Assert.assertEquals("Fungsi calculate() seharusnya mengembalikan nilai $result", "Result is $result", calculate(valueA, valueB, valueC))
    }

    @Test
    fun testNonNull() = checkFunction(65, 52, 78)

    @Test
    fun testNull() = checkFunction(50, 41, null)
}