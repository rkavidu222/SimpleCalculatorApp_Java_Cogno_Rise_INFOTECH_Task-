import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {

            // get opertor from user
            System.out.println("***************Calculator App***************");
            System.out.println();

            System.out.println("Select an operator");
            System.out.println("(+)");
            System.out.println("(-)");
            System.out.println("(*)");
            System.out.println("(/)");
            System.out.println();
            char operator = scanner.next().charAt(0);


            // get first number from user
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            //get second number from user
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();
            System.out.println();


            //operation
            double result;
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        throw new ArithmeticException("Division by zero is not allowed.");
                    }
                    result = num1 / num2;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid operator. Please use one of the following: +, -, *, /");
            }

            // Display the result
            System.out.println("Your answer is: " + result);
            System.out.println("**************Thank You!**************");

        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter numeric values for numbers and a valid operator.");
        }
    }
}
