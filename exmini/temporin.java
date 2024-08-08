import java.util.Scanner;

/**
 * A class to demonstrate reading user input using Scanner in Java.
 */
public class InputExample {

    /**
     * Reads a line of input from the user.
     *
     * @return the input string entered by the user.
     */
    public String readUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter some text: ");
        String input = sc.nextLine();
        return input;
    }

    public static void main(String[] args) {
        InputExample example = new InputExample();
        String userInput = example.readUserInput();
        System.out.println("You entered: " + userInput);
    }
}
