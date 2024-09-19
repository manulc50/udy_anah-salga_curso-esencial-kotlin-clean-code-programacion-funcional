package funciones

fun main() {
    val welcome = getWelcomeText()
    println(welcome)
    println(clearText(welcome))
}

// Cuando el cuerpo de una función o método solo tiene una sentencia, podemos implementar dicha función o método
// de esta manera:
fun getWelcomeText(): String = "** Welcome to the best experience **"

fun clearText(text: String): String = text
    .removePrefix("**")
    .removeSuffix("**")
    .trim()