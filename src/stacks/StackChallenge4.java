package stacks;
import java.util.Scanner;
import java.util.Stack;

public class StackChallenge4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack stack = new Stack();

        //Captures the amount you wish to contribute each year
        System.out.println("What amount would you like to contribute to your 401k each year?");
        input.nextInt();
        if (input > 24500) {
            System.out.println("Your 401k personal contribution is too high.");

        } else if (input == 24500) {
            System.out.println("You have reached your 401k personal contribution.");
        } else {

        }


        //Capture percentage of interest that you think you will earn each year on average
        //Display of the previous total and new total for each year over a 30 year period
        //Each line of output should include Year, Previous Total, New Total
        //Values should use a Stack to store each year's values
        //Initial line of output should identify the annual contribution and % set by the user
        //Output:





        //Close scanner
        input.close();

    }
}
