package split

fun main() {
    val supermarket = listOf(
        "Milk",
        "Eggs",
        "Juice",
        "Meat",
        "Rice"
    )
    val breakfastList = supermarket
        .take(3)
        //.filterNot { it.equals("Eggs") }
        // En Kotlin se recomienda comparar Strings de esta forma en vez de la forma de arriba(forma de Java)
        .filterNot { it == "Eggs" }
    println(breakfastList.joinToString())
    val dinnerList = supermarket.drop(3)
    println(dinnerList.joinToString())
}