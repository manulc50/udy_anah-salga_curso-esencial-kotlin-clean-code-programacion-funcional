package funciones

fun main() {
    //val isValid = isValid(5, { it > 4 })
    // Como el último argumento es una función lambda, podemos scarla fuera de esta manera:
    val isValid = isValid(5) { it > 4 }
    println(isValid)
    // Argumento posicional
    //consultProductId(getOnNextProductIdBehavior())
    // Argumento por nombre
    consultProductId(onNext = getOnNextProductIdBehavior())
}

// Función que recibe una función lambda como argumento de entrada
fun isValid(x: Int, validate: (x: Int) -> Boolean): Boolean = validate(x)
fun consultProductId(onNext: (productId: String) -> Unit) {
    val productId = "WERT123"
    onNext(productId)
}
// Función que devuelve una función lambda
fun getOnNextProductIdBehavior(): (productId: String) -> Unit {
    return { println("Go to product detail screen with product id: $it") }
}
