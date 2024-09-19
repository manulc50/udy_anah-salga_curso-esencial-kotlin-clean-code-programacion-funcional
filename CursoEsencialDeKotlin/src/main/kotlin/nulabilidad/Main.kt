package nulabilidad

fun main() {
    // "number1" sólo puede ser nulo
    val number1 = null
    // "number2" puede ser un entero o nulo
    val number2: Int? = null
    // Si no existe, es decir, es null, no hagas nada. Si existes, es decir, es distinto a invoca al método
    number2?.inc()
    // Operador Elvis ?:
    // Si no es null, devuelve el valor de "number2". Si es null, devuelve 0
    number2 ?: 0
}