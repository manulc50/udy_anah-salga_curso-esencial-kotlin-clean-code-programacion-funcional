package algoritmo

fun main() {
    val numbers = intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)
    //val numbers = intArrayOf(1, 1, 2)
    //val numbers = intArrayOf(0)
    //val numbers = intArrayOf()
    if(numbers.size > 1) {
        var j = 1
        for(i in 1 until numbers.size) {
            if(numbers[i] != numbers[i-1]) {
                numbers[j] = numbers[i]
                j++
            }
        }
        for(i in j until numbers.size)
            numbers[i] = 0
    }
    println(numbers.toList())
}