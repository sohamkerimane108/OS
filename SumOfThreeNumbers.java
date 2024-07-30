import java.util.Scanner;

public class SumOfThreeNumbers {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter three numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Calculate the sum of the three numbers
        int sum = num1 + num2 + num3;

        // Display the result
        System.out.println("The sum of " + num1 + ", " + num2 + ", and " + num3 + " is: " + sum);

        System.out.println("This is updated file");// Close the scanner
        scanner.close();
    }
}
