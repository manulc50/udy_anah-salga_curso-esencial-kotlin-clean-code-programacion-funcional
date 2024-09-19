package estructurascontrol

import kotlin.math.roundToInt

fun main() {
    val isLoggedIn = true
    when(isLoggedIn) {
        true -> println("Usuario logeado")
        false -> println("Usuario no logeado")
    }
    val userStatus = 10
    val userStatusString = when(userStatus) {
        0 -> "Logged out"
        1 -> "Logged in"
        -1 -> "Down"
        in 10..20 -> "Inactive for $userStatus"
        else -> "Not found"
    }
    println(userStatusString)
    // Any -> Cualquier tipo de dato
    val productPrices: Any = doubleArrayOf(15.99, 11.10, 45.99)
    val total = when(productPrices) {
        is DoubleArray -> productPrices.sum().roundToInt().toString()
        is Double -> productPrices.roundToInt().toString()
        is Int -> productPrices.toString()
        else -> productPrices.toString()
    }
    println("Total: $total")
    val hasAddress = false
    val user = "John"
    val message = when {
        isLoggedIn and hasAddress -> "Lista de direcciones de $user"
        isLoggedIn and !hasAddress -> "$user no tiene direcciones"
        else -> ""
    }
    println("Message: $message")
}