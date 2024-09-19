package tiposdatos

fun main() {
    // Número enteros

    // Byte -> [-128, 127] números
    // Por defecto, Kotlin interpreta el tipo de los números enteros como Int
    // "age" es de tipo Int
    val age = 20
    // "newAge" es de tipo Byte
    val newAge: Byte = 127
    // Error: No cabe en un Byte
    // val newAge: Byte = 128

    // Short -> [-32768, 32767] números

    // Int -> 2 mil millones -> [-2147483648, 2147483647] números
    val productId= 2147483647
    val productId2 = 2_147_483_647
    // Error: No cabe en un Int
    //val productId3: Int = 2_147_483_648

    // Long -> 9 trillones de números -> [-2^63, 2^63-1] números
    val userId = 9_223_372_036_854_775_807
    val userId2 = 9_223_372_036_854_775_807L
    // Error: No cabe en un Long
    //val userId3 = 9_223_372_036_854_775_808L

    // Números decimales

    // Por defecto, Kotlin interpreta el tipo de los números decimales como Double
    // Un Double admite como mucho 16 decimales
    val myDouble = 2.1234567892345675
    // Un Float admite como mucho 7 decimales
    val myFloat = 2.1234577
    // Si nos pasamos del número de decimales permitidos, el resto de decimales se truncan
    println(myDouble)
    println(myFloat)

    // Booleanos - 1 Byte

    val isLoggedIn: Boolean = true
    val hasAddress = false

    // And
    // true & true = true
    // true & false = false
    // false & true = false
    // false & false = false

    // Tres forma equivalente
    println(isLoggedIn && hasAddress)
    println(isLoggedIn.and(hasAddress))
    println(isLoggedIn and hasAddress)

    // Or
    // true | true = true
    // true | false = true
    // false | true = true
    // false | false = false

    // Tres forma equivalente
    println(isLoggedIn || hasAddress)
    println(isLoggedIn.or(hasAddress))
    println(isLoggedIn or hasAddress)

    // Not
    // !true = false
    // !false = true

    // Dos forma equivalente
    println(!isLoggedIn)
    println(isLoggedIn.not())

    // Char - 2 Bytes

    val keyInserted: Char = 'a'
    println(keyInserted)
    // Escapado de caracteres especiales
    println('\$')
    println('\'')
}