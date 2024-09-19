package arrays

// Nota: En Kotlin, los elementos de un Array siempre se almacenan en memoria consecutivamente

fun main() {
    // Si no indicamos el tipo del Array, sus elementos pueden ser de cualquier tipo
    val myArray = arrayOf(1, "hola", 2.5F, 1000L, 'c', true)
    println(myArray[1])
    myArray[1] = "adios"
    // Los Arrays son mutables
    println(myArray[1])
    // En la declaración de un Array vacío, siempre tenemos que indicar un tipo(En este caso, Int)
    val emptyArray = emptyArray<Int>()
    // Array tipado - En este caso, sus elementos tienen que ser de tipo Byte
    // Array de Bytes vacío
    val myByteArray1 = byteArrayOf()
    // Array de Bytes inicializado
    val myByteArray2 = byteArrayOf(1, 2, 3)
    // Array de Ints inicializado
    val myIntArray = intArrayOf(4, 5, 6, 7, 8)
    // Array de Ints indicando su tamaño
    val arrayInt = IntArray(5)
    // Array de Ints indicando su tamaño e inicializándolo mediante una función lambda
    // En este caso, cada elementos del Array se inicializa con su correspondiente índice
    //val arrayInt2 = IntArray(5, { i: Int -> i })
    // Nota: Si la función lambda es el último parámetro de un constructor o una función, podemos sacarla de esta forma:
    val arrayInt2 = IntArray(5) { i: Int -> i }
    arrayInt2.forEach { println(it) }
    println("----------")
    // Nota: Si no indicamos los argumentos de una función lambda, por defecto se utiliza el argumento "it"
    // En este caso, la función lambda imprime el índica de cada elemento del Array e inicializa cada elemento con true
    val arrayBoolean = BooleanArray(3) {
        println(it)
       true
    }
    // En este caso, como hemos definido el argumento de la función lambda, no usamos el argumento por defecto "it"
    arrayBoolean.forEach { el -> println(el) }
    // Nota: Todas las declaraciones de Arrays anteriores utilizan por debajo Arrays de datos primitivos de Java(Por ejemplo, int[])
    // Si queremos que se utilice por debajo Arrays de Objetos de Java(Por ejemplo, Integer[]), tenemos que declarar los Arrays así:
    // val myArray = Array<Int>
}