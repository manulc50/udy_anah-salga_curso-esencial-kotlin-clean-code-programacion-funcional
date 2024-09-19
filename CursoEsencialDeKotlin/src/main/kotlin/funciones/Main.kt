package funciones

fun main() {
    val appName = "My Fabulous App"
    println(addStartsFormat(appName, 5))
    val welcome = "Welcome to the best experience"
    println(addStartsFormat(welcome, 3))
    val name = "John Doe"
    println(addStartsFormat(name, 2))
    println(addStartsFormat(name))
}

fun addStartsFormat(text: String, starsNumber: Int): String {
    val textBuilder = StringBuffer(text)
    textBuilder.insert(0, " ")
    textBuilder.insert(textBuilder.length, " ")
    for(i in 0 until starsNumber) {
        textBuilder.insert(0, "*")
        textBuilder.insert(textBuilder.length, "*")
    }
    return textBuilder.toString();
}

// Sobrecarga de funciones
fun addStartsFormat(text: String): String = addStartsFormat(text, 2)