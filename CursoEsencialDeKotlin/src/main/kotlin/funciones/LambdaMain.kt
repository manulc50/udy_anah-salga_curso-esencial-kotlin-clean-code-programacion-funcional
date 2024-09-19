package funciones

fun main() {
    // Declaración y llamada de una función lambda que no recibe argumentos y no devuelve nada
    val printHola = {
        println("Hola Lambda")
    }
    printHola()

    // Declaración y llamada de una función lambda que recibe un argumento de entrada y no devuelve nada
    val printText = { text: String -> println(text) }
    printText("Hola Lambda")

    // Declaración y llamada de una función lambda que recibe un argumento de entrada y devuelve un valor
    val addOneTo = { x: Int -> x + 1 }
    println(addOneTo(4))

    // En este caso, indicamos que el tipo de dato de la variable es una función lambda que recibe un entero y devuelve otro
    val addFiveTo: (Int) -> Int = { it + 5 }
    println(addFiveTo(5))

    // Usamos el caracter '_' para indicamos que no vamos a usar un argumento de entrada de la función lambda
    val sum: (Int, Int, String) -> Int = { x: Int, y: Int, _: String -> x + y }
    println(sum(2, 7, ""))

    val sum2: (Int, Int, String) -> Int = { x: Int, y: Int, message: String ->
        val total = x + y
        println("$message, $total")
        // En Java sería "return total"
        total
    }
    sum2(5, 2, "El resultado es")
}