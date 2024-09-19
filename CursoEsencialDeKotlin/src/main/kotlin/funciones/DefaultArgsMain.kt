package funciones

fun main() {
    showWelcomeMessage("Hola")
    showWelcomeMessage("Hi")
    showWelcomeMessage("Buenos días")
    val username1 = "johndoe"
    // Argumentos posiciones
    showWelcomeMessage("Welcome", username1)
    val username2 = "joebucks"
    // Argumentos por nombre
    showWelcomeMessage(user = username2, text = "Welcome")
}

fun showWelcomeMessage(text: String, user: String = "") {
    val message = "$text $user"
    println(message)
}