/* Multiplication table by the specified number. */

//The Scanner class is used to get user input.
import java.util.Scanner
fun main() {
    //create a Scanner object named reader that reads the input stream from the system.
    val reader = Scanner(System.`in`)
    print("Enter a value: ")
    var a: Int = reader.nextInt()

    for (i in 1..10){
        println("$a x $i = ${a*i}")
    }
}