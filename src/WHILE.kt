/* WHILE Statement:
Enter an integer value and then use a while loop to print the numbers starting from the entered value until it reaches 10. */

//The Scanner class is used to get user input.
import java.util.Scanner
fun main() {
    //create a Scanner object named reader that reads the input stream from the system.
    val reader = Scanner(System.`in`)
    print("Please enter a number: ")
    var a = reader.nextInt()

    while (a <= 10){
        println("$a")
        a++
    }
}