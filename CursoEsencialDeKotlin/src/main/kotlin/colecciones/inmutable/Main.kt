package colecciones.inmutable

fun main() {
    println("LIST")

    // Lista inmutable - Respetan el orden de inserción y permiten elementos duplicados
    //val list = listOf<Int>(1, 2, 3)
    val list = listOf(1, 2, 3)
    println(list[2])
    println(list.get(1))
    //list.forEach { num -> println(num) }
    list.forEach { println(it) }
    println()

    println("SET")
    // Set inmutable - No respetan el orden de inserción y no permite elementos duplicados
    val set = setOf(1, 2, 2, 3)
    println(set.size)
    //set.forEach({ println(it) })
    // Cuando el último argumento de entrada de una función o método es una función lambda, podemos sacarla
    // fuera de esta forma
    set.forEach{ println(it) }
    val setNames = setOf("John", "Joe", "John", "Martha")
    setNames.forEach { println(it) }
    println()

    println("MAP")
    // Map inmutable
    val map = mapOf(
        1 to "John",
        2 to "Sandra",
        3 to "Ramón"
    )
    map.forEach {
        val id = it.key
        val name = it.value
        println("$id. $name")
    }
}