/* Multiplication table by the number from 1 to 10 */
fun main() {
    for (i in 1..10){
        for (j in 1..10){
            println("$i x $j = ${i*j}")
        }
        println()
    }
}