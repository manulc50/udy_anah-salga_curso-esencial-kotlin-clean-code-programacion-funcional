package estructurascontrol

fun main() {
    val greetings = arrayOf("Hola", "Te doy la bienvenida", "Hi", "Buenos días", "Hello")
    var i = 0
    while(i < greetings.size) {
        println(greetings[i])
        i++
    }
    println("-----------")
    i = 0
    do {
        val greeting = greetings[i]
        println(greeting)
        i++
    }
    while(greeting.length > 2 && i < greetings.size)
    println("-----------")
    i = 0
    while(i < greetings.size) {
        val greeting = greetings[i]
        println(greeting)
        if(greeting.length <= 2)
            break
        i++
    }
}