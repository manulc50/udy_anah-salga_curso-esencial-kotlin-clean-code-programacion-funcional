package conversiondatos

fun main() {
    val productLowStock: Byte = 20
    val productStock: Int = productLowStock.toInt()
    println(productStock)
    val numberString = "1"
    val numberByte = numberString.toByte()
    println("El número en bytes es: $numberByte")
    val numberDouble = numberString.toDouble()
    println("El número en Double es: $numberDouble")
    val unicodeInt = 0x2764 // Número en hexadecimal
    val unicodeChar = unicodeInt.toChar()
    println(unicodeChar)

}