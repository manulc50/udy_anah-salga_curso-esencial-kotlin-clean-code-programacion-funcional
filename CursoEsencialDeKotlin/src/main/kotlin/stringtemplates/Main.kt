package stringtemplates

fun main() {
    val price = 15.25
    val tax = 0.16
    val out = "La cantidad de $price después de impuestos es: $${price * (1 + tax)}"
    println(out)
    val disclaimer = "La cantidad está en \$MXN"
    println(disclaimer)
    // total = price * (tax + 1)
    val total = price.times(tax.plus(1))
    println(total)
    println(total.toFloat())
}