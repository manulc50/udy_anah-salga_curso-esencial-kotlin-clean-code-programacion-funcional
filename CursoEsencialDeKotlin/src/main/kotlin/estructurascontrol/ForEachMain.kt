package estructurascontrol

import kotlin.system.measureNanoTime

// En Kotlin, los elementos de un Array se almacenan consecutivamente, sin embargo, los elementos de
// una lista pueden almacenarse en memoria en posiciones no consecutivas. Por esta razón, a veces es mejor usar
// Arrays en vez de Lista porque son más óptimas dependiendo del tipo de algoritmo a usar

fun main() {
    // Recomendado
    val forInRange = measureNanoTime {
        for(i in 0..1000) {
            i
        }
    }
    // No recomendado
    val forEachRange = measureNanoTime {
        // Un rango en Kotlin es una colección y, por lo tanto, dispone del método "forEach"
        (0..1000).forEach{ it }
    }
    // Nota: Se recomienda iterar los rangos usando bucles for-in en vez de bucles for-each porque tardan mucho menos
    println("forInRange: $forInRange, forEachRange: $forEachRange")

    // Crea una lista a partir de un rango de enteros
    val objectList = (0..1000).toList()
    // No recomendado
    val forInList = measureNanoTime {
        for(i in objectList) {
            i
        }
    }
    // Recomendado
    val forEachList = measureNanoTime {
        objectList.forEach{ it }
    }
    // Nota: Se recomienda iterar las colecciones usando bucles for-each en vez de bucles for-in porque tardan mucho menos
    println("forInList: $forInList, forEachList: $forEachList")
}