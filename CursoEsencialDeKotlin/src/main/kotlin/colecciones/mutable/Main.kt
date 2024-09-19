package colecciones.mutable

fun main() {
    println("MUTABLE LIST")
    val list = listOf(1, 2, 3)
    // Convierte una lista inmutable en una lista mutable
    val anotherMutableList: MutableList<Int> = list.toMutableList()
    val mutableList = mutableListOf(1, 2, 2, 3)
    mutableList.add(4)
    //mutableList.set(2, 3)
    // En Kotlin se recomienda actualizar los elementos de una Lista de esta forma y no de la forma anterior(forma de Java)
    mutableList[2] = 3
    mutableList.removeAt(3)
    mutableList.forEach { println(it) }

    println()
    println("MUTABLE SET")
    val mutableSet = mutableSetOf(1, 2, 2, 3)
    mutableSet.forEach { println(it) }

    println()
    println("MUTABLE MAP")
    val mutableMap = mutableMapOf(
        1 to "John",
        2 to "Mary",
        3 to "Sandra"
    )
    //mutableMap.put(4, "Joe")
    // En Kotlin se recomienda añadir o actualizar elementos de un Map de este forma y no de la forma anterior(forma de Java)
    mutableMap[4] = "Joe"
    mutableMap.forEach { el ->
        val id = el.key
        val name = el.value
        println("$id. $name")
    }
}