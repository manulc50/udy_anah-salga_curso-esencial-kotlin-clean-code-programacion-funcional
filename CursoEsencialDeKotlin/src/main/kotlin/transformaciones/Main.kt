package transformaciones

fun main() {
    val languages = listOf(
        "Java",
        "C",
        "Php",
        "Swift"
    )
    val strLanguages = languages.map { "Language: $it" }
    strLanguages.forEach { println(it) }

    val numbers = listOf(1, 2, 3)
    val items = numbers.map { num -> "$num. item" }
    println(items.joinToString())

    val data = listOf("1", "2", "*", "3", "/", null)
    val dataNumbers = data.mapNotNull { it?.toIntOrNull() }
    println(dataNumbers)
    println(dataNumbers.sum())
}