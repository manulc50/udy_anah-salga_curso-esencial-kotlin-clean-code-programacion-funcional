package arrays

fun main() {
    val greetings = arrayOf("Hola", "Hi", "Te doy la bienvenida", "Buenos días", "Hello")
    val introductions = arrayOf("mi nombre es", "puedes llamarme", "usualmente me llaman", "yo soy")
    val names = arrayOf("John", "Joe", "Marie", "Martha", "Irene")
    val randIndexGreeting = (Math.random() * greetings.size).toInt()
    val randIndexIntroduction = (Math.random() * introductions.size).toInt()
    val randIndexName = (Math.random() * names.size).toInt()
    val phrase = "${greetings[randIndexGreeting]} ${introductions[randIndexIntroduction]} ${names[randIndexName]}"
    println(phrase)
}