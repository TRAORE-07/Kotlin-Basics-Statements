/* When Statement:
Enter a number between 1 and 7 and then display the corresponding day of the week. */

//The Scanner class is used to get user input.
import java.util.Scanner
fun main() {
    //create a Scanner object named reader that reads the input stream from the system.
    val reader = Scanner(System.`in`)
    print("Please enter a number between 1 to 7: ")
    var a = reader.nextInt()

    when (a){
        1 -> print("1st week day is Monday")
        2 -> print("2nd week day is Tuesday")
        3 -> print("3rd week day is Wednesday")
        4 -> print("4th week day is Thursday")
        5 -> print("5th week day is Friday")
        6 -> print("6th week day is Saturday")
        7 -> print("7th week day is Sunday")
        else -> print("This is not a day")
    }
}