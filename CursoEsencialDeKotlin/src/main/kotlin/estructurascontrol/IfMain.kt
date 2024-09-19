package estructurascontrol

fun main() {
    val isLoggedIn = true
    val hasAddress = false
    if(isLoggedIn) {
        println("El usuario está logeado")
        if (hasAddress)
            println("Mostrar lista de direcciones")
        else
            println("El usuario no tiene direcciones")
    }
    else
        println("El usuario no está logeado")
    val userLoggedInStatus = if(isLoggedIn) "Logeado" else "No logeado"
    println("Usuario: $userLoggedInStatus")
}