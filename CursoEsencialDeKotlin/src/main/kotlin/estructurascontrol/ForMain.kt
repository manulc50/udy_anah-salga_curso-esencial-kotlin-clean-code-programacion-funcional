package estructurascontrol

fun main() {
    for(i in 0..4)
        println(i)
    println("-------")
    for(i in 0.rangeTo(4))
        println(i)
    println("-------")
    for(c in 'a'..'c')
        println(c)
    println("-------")
    for(c in 'c'.downTo('a'))
        println(c)
    println("-------")
    val greetings = arrayOf("Hola", "Te doy la bienvenida", "Hi", "Buenos días", "Hello")
    /*var i = 0
    while(i < greetings.size) {
        println(greetings[i])
        i++
    }*/
    for(greeting in greetings)
        println(greeting)
    println("-------")
    for(i in 0..greetings.size - 1)
        println(greetings[i])
    println("-------")
    for(i in greetings.indices)
        println(greetings[i])
    println("-------")
    // "until" no tiene en cuenta el último elemento del rango
    for(i in 0 until greetings.size)
        println(greetings[i])
}