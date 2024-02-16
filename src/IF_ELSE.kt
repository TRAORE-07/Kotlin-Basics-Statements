/* Conditional Statement:
Enter three integer values (a, b, and c) and then determine which one of them is the greatest.
If two or more variables are equal and greater than or equal to the other(s), display a corresponding message. */

//The Scanner class is used to get user input.
import java.util.Scanner
fun main() {
    //create a Scanner object named reader that reads the input stream from the system.
    val reader = Scanner(System.`in`)
    print("Please enter the value of a: ")
    var a = reader.nextInt()
    print("Please enter the value of b: ")
    var b = reader.nextInt()
    print("Please enter the value of c: ")
    var c = reader.nextInt()

    if (a > b && a > c) {
        println("a = $a is greater")
    }
    else if (b > c){
        println("b = $b is greater")
    }
    else if (c > a){
        println("c = $c is greater")
    }
    else{
        println("Two or more variables are equal and greater than or equal to the other(s).")
    }
}