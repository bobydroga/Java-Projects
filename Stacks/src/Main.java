import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack stack = new Stack();  // Create a new stack object
        // Print the available commands to the user
        System.out.println("Welcome to Stacks!");
        System.out.println("- List of command");
        System.out.println("- Enter (a) to the above question and enter an integer you wish to add to your stack");
        System.out.println("- Enter (+ or *) as an operator to be applied to the last two items added to your stack");
        System.out.println("- Enter (?) if you wish to see everything in your stack printed to the screen");
        System.out.println("- Enter (p) if you wish to remove the last item");
        System.out.println("- Enter (z) if you are done playing with stacks");

        while (true) {  // Loop until the user enters the "z" command
            System.out.print("Would you like to command: ");
            String input = scanner.nextLine();
            String[] tokens = input.split(" ");
            String command = tokens[0];
            if (command.equals("a")) {
                // If the user wants to add a new value to the stack
                int value = Integer.parseInt(tokens[1]);
                stack.push(value);
                System.out.println("Your value has been added to the stack!");
            } else if (command.equals("+")) {
                // If the user wants to add the last two values in the stack
                int a = stack.pop();
                int b = stack.pop();
                if (a != -1 && b != -1) {
                    stack.push(a + b);
                    System.out.println("You have added the last two items in your stack and pushed the total: " + (a+b));
                }
            } else if (command.equals("*")) {
                // If the user wants to multiply the last two values in the stack
                int a = stack.pop();
                int b = stack.pop();
                if (a != -1 && b != -1) {
                    stack.push(a * b);
                    System.out.println("You have multiplied the last two items in your stack and pushed the total: " + (a*b));
                }
            } else if (command.equals("?")) {
                // If the user wants to print the stack
                System.out.println("Your stack items are: " + stack.toString());
            } else if (command.equals("p")) {
                // If the user wants to remove the last value from the stack
                int value = stack.pop();
                if (value != -1) {
                    System.out.println("The last item (" + value + ") has been removed from your stack!");
                }
            } else if (command.equals("z")) {
                // If the user wants to exit the program
                System.out.println("Thanks for playing!");
                break;
            }
        }
    }
}
