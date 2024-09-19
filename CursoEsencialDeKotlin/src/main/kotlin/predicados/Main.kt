package predicados

fun main() {
    val ages = listOf(12, 22, 17, 30, 29, 15)
    val adultAges = ages.filter { it >= 18 }
    println(adultAges.joinToString())
    val kidAges = ages.filterNot { age -> age >= 18 }
    println(kidAges.joinToString("-"))
    // Devuelve un par de listas. La primera contiene los elementos que cumplen el predicado y la segunda
    // contiene los elementos que no cumplen el predicado
    val allAges = ages.partition { it >= 18 }
    val allAges2 = allAges.first
    val kidAges2 = allAges.second
    println(allAges2.joinToString())
    println(kidAges2.joinToString())
    val data = listOf("One", null, "Two", null, null, "Three")
    val dataNotNull = data.filterNotNull()
    println(dataNotNull.joinToString())
}