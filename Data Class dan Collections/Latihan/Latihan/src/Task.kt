fun main() {

    // TODO 1
    val user = mapOf<String, String>("name" to "John",
            "age" to "23",
            "address" to "St. Petersburg")

    // TODO 2
    val name = user.getValue("name")
    val age = user.getValue("age")
    val address = user.getValue("address")

    // TODO 3
    fun cetak(name : String, age : String, address : String) : String = """User
        |Name: $name
        |Age: $age
        |Address: $address
    """.trimMargin()


    println(cetak(name, age, address))

   /* println("""User
        |Name: $name
        |Age: $age
        |Address: $address
    """.trimMargin())*/



}