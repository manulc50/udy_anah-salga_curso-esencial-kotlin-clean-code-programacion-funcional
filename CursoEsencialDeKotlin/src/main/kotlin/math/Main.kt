package math

import java.math.BigDecimal

fun main() {
    val productPrices = listOf(
        BigDecimal(33.5),
        BigDecimal(99.99),
        BigDecimal(50.5),
        BigDecimal(10.5)
    )
    // Comparación usando la forma de Java
    //val economyPrices = productPrices.filter { price -> price.compareTo(BigDecimal(50)) < 0 }
    // Comparación usando la forma recomendada de Kotlin
    val economyPrices = productPrices.filter { it < BigDecimal(50) }
    println(economyPrices.joinToString())
    val countEconomyPrices = productPrices.count { it < BigDecimal(50) }
    println(countEconomyPrices)
    val total = productPrices.sumOf { it.toBigInteger() }
    println(total)
    val randomPrice = productPrices.random()
    println(randomPrice)
    val scores = listOf(5.0, 4.9, 4.6, 4.7)
    val avgScores = scores.average().toFloat()
    println(avgScores)

}